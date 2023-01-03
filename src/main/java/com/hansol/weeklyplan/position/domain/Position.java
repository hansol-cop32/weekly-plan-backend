package com.hansol.weeklyplan.position.domain;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@DynamicInsert    // DB 기본값 적용
@DynamicUpdate
@Entity
@Table(name = "position")
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	protected Position() {
	}

	@Builder
	public Position(String name) {
		this.name = name;
	}
}
