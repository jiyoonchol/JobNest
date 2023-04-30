package com.solo.jobnest.domain.member.entity;

import com.solo.jobnest.global.audit.BaseTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Members")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Member_ID")
    private Long memberId;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String nickName;

    @Column
    private String userName;

    @Column
    private int age;

    @Column
    private String gender;

    @Column
    private int phoneNumber;

    @Column
    private String address;

    @Column
    private String education;

    @Column
    private String career;

    @Column
    private String certificate;

    @Column
    private String selfIntroduction;
}
