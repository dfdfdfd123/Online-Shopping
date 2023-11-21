package com.example.demo.common.service;

import org.springframework.stereotype.Service;

import com.example.demo.common.dto.MemberDTO;
import com.example.demo.common.entity.MemberEntity;
import com.example.demo.common.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  public void saveMember(MemberDTO memberDTO) {
    MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
    memberRepository.save(memberEntity);
  }

  public boolean loginMember(MemberDTO memberDTO)
  {
     // 사용자 아이디로 사용자 찾기
     MemberEntity user = memberRepository.findByMemberid(memberDTO.getMemberid());

     if (user == null) {
         // 사용자를 찾을 수 없음 - 로그인 실패
         return false;
     }
 
     // 데이터베이스에 저장된 비밀번호와 입력된 비밀번호를 평문으로 비교
     if (memberDTO.getPassword().equals(user.getPassword())) {
         // 비밀번호 일치 - 로그인 성공
         // 로그인 처리 (세션 생성 등)
         return true;
     } else {
         // 비밀번호 불일치 - 로그인 실패
         return false;
     }
    }
}
