package com.hansol.weeklyplan.dept.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeptRequest {
    private String name;
    private Integer level;
    private Long parentId;

    @Builder
    public DeptRequest(String name, Integer level, Long parentId) {
        this.name = name;
        this.level = level;
        this.parentId = parentId;
    }
}
