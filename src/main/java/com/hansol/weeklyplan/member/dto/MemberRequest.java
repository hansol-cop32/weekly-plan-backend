package com.hansol.weeklyplan.member.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRequest {

    private Long positionId;
    private Long deptId;

    private String empId;   // 사번
    private String name;
    private String password;

    @Builder
    public MemberRequest(Long positionId, Long deptId, String empId, String name, String password) {
        this.positionId = positionId;
        this.deptId = deptId;
        this.empId = empId;
        this.name = name;
        this.password = password;
    }
}
