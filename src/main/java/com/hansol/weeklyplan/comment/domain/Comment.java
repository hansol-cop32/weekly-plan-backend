package com.hansol.weeklyplan.comment.domain;

import com.hansol.weeklyplan.global.time.TimeEntity;
import com.hansol.weeklyplan.member.domain.Member;
import com.hansol.weeklyplan.task.domain.Task;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@DynamicInsert    // DB 기본값 적용
@DynamicUpdate
@Entity
@Table(name = "comment")
public class Comment extends TimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    // task_id
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    // member_id
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    protected Comment() {
    }

	@Builder
	public Comment(String content, Task task, Member member) {
		this.content = content;
		this.task = task;
		this.member = member;
	}
}
