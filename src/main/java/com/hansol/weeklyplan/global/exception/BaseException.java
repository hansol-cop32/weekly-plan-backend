package com.hansol.weeklyplan.global.exception;


import com.hansol.weeklyplan.global.response.BaseResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BaseException extends RuntimeException {
    BaseResponseStatus status;
}

