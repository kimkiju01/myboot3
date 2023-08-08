package com.myboot03.member.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myboot03.member.dao.MemberDAO;
import com.myboot03.member.vo.MemberVO;





@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public List selectAllMemberList() throws DataAccessException {
		List membersList = null;
		membersList = memberDAO.selectAllMemberList();
		return membersList;
	}

	@Override
	public int insertMember(MemberVO member) throws DataAccessException {
		return memberDAO.insertMember(member);
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		return memberDAO.deleteMember(id);
	}
	
	@Override
	public MemberVO loginById(MemberVO memberVO) throws Exception{
		return memberDAO.loginById(memberVO);
	}
	
//	@Override
//	public int modMember(MemberVO memberVO) throws DataAccessException {
//
//		return memberDAO.modMember(memberVO);
//	}

}
