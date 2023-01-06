package com.hansol.weeklyplan.position.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PositionResponse {

    private Long positionId;
    private String name;

    @Builder
    public PositionResponse(Long positionId, String name) {
        this.positionId = positionId;
        this.name = name;
    }
}
