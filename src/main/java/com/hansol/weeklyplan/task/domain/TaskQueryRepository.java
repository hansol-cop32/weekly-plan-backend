package com.hansol.weeklyplan.task.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TaskQueryRepository {

    private JPAQueryFactory jpaQueryFactory;
}
