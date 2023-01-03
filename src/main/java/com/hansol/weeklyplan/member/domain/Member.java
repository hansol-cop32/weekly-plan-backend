package com.hansol.weeklyplan.member.domain;

import com.hansol.weeklyplan.dept.domain.Dept;
import com.hansol.weeklyplan.position.domain.Position;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@DynamicInsert    // DB 기본값 적용
@DynamicUpdate
@Entity
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// position_id
	@OneToOne
	@JoinColumn(name = "position_id")
	private Position position;

	// dept_id
	@OneToOne
	@JoinColumn(name = "dept_id")
	private Dept dept;

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	protected Member() {
	}

	@Builder
	public Member(Position position, Dept dept, String empId, String name, String password) {
		this.position = position;
		this.dept = dept;
		this.empId = empId;
		this.name = name;
		this.password = password;
	}
}
