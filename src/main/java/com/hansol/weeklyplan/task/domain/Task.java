package com.hansol.weeklyplan.task.domain;

import javax.persistence.*;

@Entity(name = "task")
public class Task {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//member_id

	@Column(name = "content")
	private String content;

	@Column(name = "is_done")
	private Boolean isDone;

	@Column(name = "is_deleted")
	private Boolean isDeleted;
}
