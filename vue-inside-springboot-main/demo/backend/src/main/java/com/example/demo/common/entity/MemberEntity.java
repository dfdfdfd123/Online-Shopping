package com.example.demo.common.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.common.dto.MemberDTO;

import lombok.Setter;
import lombok.Getter;

@Entity
@Setter
@Getter
@Table(name = "member_table2")
public class MemberEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String memberid;

  @Column(unique = true)
  private String password;

  @Column 
  private String name;

  @Column
  private String gender;

  @Column 
  private String phone;

  @Column
  private String email;

  public static MemberEntity toMemberEntity(MemberDTO memberDTO)
  {
    MemberEntity memberEntity = new MemberEntity();
    memberEntity.setId(memberDTO.getId());
    memberEntity.setMemberid(memberDTO.getMemberid());
    memberEntity.setPassword(memberDTO.getPassword());
    memberEntity.setName(memberDTO.getName());
    memberEntity.setGender(memberDTO.getGender());
    memberEntity.setPhone(memberDTO.getPhone());
    memberEntity.setEmail(memberDTO.getEmail());
    return memberEntity;
  }
  
}
