package com.hansol.weeklyplan.controller;

import com.hansol.weeklyplan.comment.CommentService;
import com.hansol.weeklyplan.comment.dto.CommentResponse;
import com.hansol.weeklyplan.global.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

//    @GetMapping
//    public BaseResponse<List<CommentResponse>> commentList() {
//        ResponseEntity
//        return commentService.findComments();
//    }

}
