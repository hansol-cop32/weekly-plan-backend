package com.hansol.weeklyplan.task.domain;

import com.hansol.weeklyplan.member.domain.Member;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@DynamicInsert    // DB 기본값 적용
@DynamicUpdate
@Entity
@Table(name = "task")
public class Task {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//member_id
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

	@Column(name = "content")
	private String content;

	@Column(name = "is_done")
	private Boolean isDone;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	protected Task() {
	}

	@Builder
	public Task(Member member, String content, Boolean isDone) {
		this.member = member;
		this.content = content;
	}
}
