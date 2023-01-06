package com.hansol.weeklyplan.comment;

import com.hansol.weeklyplan.comment.dto.CommentRequest;
import com.hansol.weeklyplan.comment.dto.CommentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
public class CommentServiceImpl implements CommentService{
    @Override
    public List<CommentResponse> findComments() {
        return null;
    }

    @Override
    public CommentResponse findComment(Long commentId) {
        return null;
    }

    @Override
    @Transactional
    public CommentRequest addComment(CommentRequest commentRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long modifyComment(Long commentId, CommentRequest commentRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long deleteComment(Long commentId) {
        return null;
    }
}
