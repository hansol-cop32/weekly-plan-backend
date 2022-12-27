package com.hansol.weeklyplan.position.domain;

import javax.persistence.*;

@Entity(name = "position")
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

}
