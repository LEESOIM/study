package com.iu.start.bankmembers;

import java.util.ArrayList;

public interface MembersDAO {
	
	//bankMembers 회원가입
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception;
	
	//검색어를 입력해서 ID 찾기
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception; 
	
}
