package com.hansol.weeklyplan.member;

import com.hansol.weeklyplan.member.dto.MemberRequest;
import com.hansol.weeklyplan.member.dto.MemberResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    @Override
    public List<MemberResponse> findMembers() {
        return null;
    }

    @Override
    public MemberResponse findMember() {
        return null;
    }

    @Override
    @Transactional
    public Long addMember(MemberRequest memberRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long modifyMember(Long memberId, MemberRequest memberRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long deleteMember(Long memberId) {
        return null;
    }
}
