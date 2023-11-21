package com.example.demo.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.common.entity.MemberEntity;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>
{
  // 아이디로 사용자 찾기
  MemberEntity findByMemberid(String memberid);
}