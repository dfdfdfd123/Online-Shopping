package com.example.demo.common.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.dto.MemberDTO;
import com.example.demo.common.service.MemberService;

import lombok.RequiredArgsConstructor;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberController {

// 생성자 주입
private final MemberService memberService;

@PostMapping("/signup") 
public ResponseEntity<String> saveMember(@RequestBody @Valid MemberDTO memberDTO) {
  System.out.println("MemberController.save");
  System.out.println("memberDTO = " + memberDTO);
  memberService.saveMember(memberDTO);

  return ResponseEntity.ok("success");
}

@PostMapping("/login") 
  public ResponseEntity<String> loginMember(@RequestBody @Valid MemberDTO memberDTO) {
  System.out.println("MemberController.save");
  System.out.println("memberDTO = " + memberDTO);

  boolean loginSuccess = memberService.loginMember(memberDTO);

    if (loginSuccess) {
        return ResponseEntity.ok("로그인 성공");
    } else {
        return ResponseEntity.badRequest().body("로그인 실패");
    }
}

}
