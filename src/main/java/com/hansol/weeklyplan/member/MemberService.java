package com.hansol.weeklyplan.member;

import com.hansol.weeklyplan.member.dto.MemberRequest;
import com.hansol.weeklyplan.member.dto.MemberResponse;

import java.util.List;

public interface MemberService {

    List<MemberResponse> findMembers();

    MemberResponse findMember();

    Long addMember(MemberRequest memberRequest);
    Long modifyMember(Long memberId, MemberRequest memberRequest);

    Long deleteMember(Long memberId);
}
