package com.solo.jobnest.domain.board.entity;

import com.solo.jobnest.global.audit.BaseTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "BOARDS")
@Getter
@Setter
@NoArgsConstructor
public class Board extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_ID")
    private Long boardId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String image;
}
