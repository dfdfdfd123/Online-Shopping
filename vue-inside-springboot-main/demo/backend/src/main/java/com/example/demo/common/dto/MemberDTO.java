package com.example.demo.common.dto;

import com.example.demo.common.entity.MemberEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@NoArgsConstructor
@ToString

public class MemberDTO {
  private Long id;
  private String memberid;
  private String password;
  private String name;
  private String gender;
  private String phone;
  private String email;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
    MemberDTO memberDTO = new MemberDTO();

     memberDTO.setId(memberEntity.getId());
      memberDTO.setMemberid(memberEntity.getMemberid());
      memberDTO.setPassword(memberEntity.getPassword());
      memberDTO.setName(memberEntity.getName());
      memberDTO.setGender(memberEntity.getGender()); 
      memberDTO.setPhone(memberEntity.getPhone());
      memberDTO.setEmail(memberEntity.getEmail());
      

    return memberDTO;
  }
}


