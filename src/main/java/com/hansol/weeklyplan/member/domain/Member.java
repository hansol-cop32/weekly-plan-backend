package com.hansol.weeklyplan.member.domain;

import javax.persistence.*;

@Entity(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// position_id

	// dept_id

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "is_deleted")
	private Boolean isDeleted;
}
