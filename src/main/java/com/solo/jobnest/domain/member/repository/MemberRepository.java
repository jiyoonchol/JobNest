package com.solo.jobnest.domain.member.repository;

import com.solo.jobnest.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
