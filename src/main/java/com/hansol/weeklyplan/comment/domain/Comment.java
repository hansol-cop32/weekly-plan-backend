package com.hansol.weeklyplan.comment.domain;

import com.hansol.weeklyplan.global.time.TimeEntity;

import javax.persistence.*;

@Entity(name = "comment")
public class Comment extends TimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "content")
	private String content;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	// task_id

	// member_id


}
