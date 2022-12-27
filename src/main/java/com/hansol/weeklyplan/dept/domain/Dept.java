package com.hansol.weeklyplan.dept.domain;

import javax.persistence.*;

@Entity(name = "dept")
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







}
