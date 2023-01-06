package com.hansol.weeklyplan.comment.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentRequest {

    private String content;
    private Long memberId;
    private Long taskId;

    @Builder
    public CommentRequest(String content, Long memberId, Long taskId) {
        this.content = content;
        this.memberId = memberId;
        this.taskId = taskId;
    }
}
