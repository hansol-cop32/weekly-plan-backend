package com.hansol.weeklyplan.dept.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DeptQueryRepository {

    private final JPAQueryFactory queryFactory;


}
