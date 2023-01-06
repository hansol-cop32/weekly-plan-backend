package com.hansol.weeklyplan.member.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberResponse {

    private String memberId;
    private String name;
    private String deptName;
    private String positionName;
    private String empId;

    @Builder
    public MemberResponse(String memberId, String name, String deptName, String positionName, String empId) {
        this.memberId = memberId;
        this.name = name;
        this.deptName = deptName;
        this.positionName = positionName;
        this.empId = empId;
    }
}
