package com.hansol.weeklyplan.comment;

import com.hansol.weeklyplan.comment.dto.CommentRequest;
import com.hansol.weeklyplan.comment.dto.CommentResponse;

import java.util.List;

public interface CommentService {

    List<CommentResponse> findComments();
    CommentResponse findComment(Long commentId);

    CommentRequest addComment(CommentRequest commentRequest);

    Long modifyComment(Long commentId, CommentRequest commentRequest);

    Long deleteComment(Long commentId);

}
