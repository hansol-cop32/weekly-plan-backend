package com.hansol.weeklyplan.dept.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeptResponse {

    private Long id;
    private String name;
    private Integer level;
    private Long parentId;

    @Builder
    public DeptResponse(Long id, String name, Integer level, Long parentId) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.parentId = parentId;
    }
}
