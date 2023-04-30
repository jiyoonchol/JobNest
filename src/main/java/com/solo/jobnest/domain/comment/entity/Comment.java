package com.solo.jobnest.domain.comment.entity;

import com.solo.jobnest.global.audit.BaseTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "COMMENTS")
@Getter
@Setter
@NoArgsConstructor
public class Comment extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMENT_ID")
    private Long commentId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String password;

}
