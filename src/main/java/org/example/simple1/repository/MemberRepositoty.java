package org.example.simple1.repository;

import org.example.simple1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepositoty extends JpaRepository<Member, Long> {
}
