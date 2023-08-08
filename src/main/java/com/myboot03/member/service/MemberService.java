package com.myboot03.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myboot03.member.vo.MemberVO;



public interface MemberService {
	 public List selectAllMemberList() throws DataAccessException;
	 public int insertMember(MemberVO memberVO) throws DataAccessException;
	 public int deleteMember(String id) throws DataAccessException;
	 public MemberVO loginById(MemberVO memberVO) throws Exception;
//	 public int modMember(MemberVO memberVO) throws DataAccessException;
}
