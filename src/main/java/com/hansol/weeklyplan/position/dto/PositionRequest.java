package com.hansol.weeklyplan.position.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PositionRequest {

    private String name;

    @Builder
    public PositionRequest(String name) {
        this.name = name;
    }
}
