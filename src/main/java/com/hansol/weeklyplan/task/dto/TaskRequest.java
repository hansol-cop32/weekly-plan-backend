package com.hansol.weeklyplan.task.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TaskRequest {

    private Long memberId;
    private String content;

    @Builder
    public TaskRequest(Long memberId, String content) {
        this.memberId = memberId;
        this.content = content;
    }
}
