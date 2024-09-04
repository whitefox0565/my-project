package com.finalProject.gym.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.finalProject.gym.model.GymVO;
import com.finalProject.gym.model.MemberVO;


public interface IGymDAO {
	public void insertGym(GymVO vo); // 체육관 등록
	public String gymNoChk(String gymNo); // 체육관번호 중복확인
	public GymVO getGymData(String memId); //체육관 정보 가져오기 
	public GymVO managerLogin(HashMap<String, Object> map); // 업주 로그인
	public String joinMemIdCheck(String id); //아이디 중복확인
	public String joinMemNickChk(String nick); //닉네임 중복확인
	public void updateMemImgNo(HashMap<String, Object> map); //마이페이지 이미지 업데이트
	public  ArrayList<GymVO> getAllGymPosition(); // 체육관 위치정보 가져오기
	public ArrayList<GymVO> getAllGymName(); //체육관 이름 전체 조회
	public ArrayList<GymVO> gymNameSearch(String searchWord); //체육관 이름 검색
	public GymVO getGymDataByName(String name); //이름으로 체육관 정보 가져오기
	public GymVO getGymPriceByGymName(String name); //이름으로 체육관 가격정보 가져오기
	public String getGymNo(String memId); // 업주계정인지 확인 
}
