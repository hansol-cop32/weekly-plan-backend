package com.hansol.weeklyplan.comment.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentResponse {

    private Long id;
    private String name;
    private String content;

    @Builder
    public CommentResponse(Long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }
}
