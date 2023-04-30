package com.solo.jobnest.domain.comment.repository;

import com.solo.jobnest.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
