package com.hansol.weeklyplan.dept.domain;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@DynamicInsert	// DB 기본값 적용
@DynamicUpdate
@Entity
@Table(name = "dept")
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "level")
	private Integer level;

	@Column(name = "parent_id")
	private Integer parentId;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	protected Dept() {
	}

	@Builder
	public Dept(String name, Integer level, Integer parentId) {
		this.name = name;
		this.level = level;
		this.parentId = parentId;
	}
}
