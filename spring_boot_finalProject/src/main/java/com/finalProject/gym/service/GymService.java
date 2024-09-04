package com.finalProject.gym.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.finalProject.gym.dao.IGymDAO;
import com.finalProject.gym.model.GymVO;


@Service
public class GymService implements IGymService {
	@Autowired
	IGymDAO dao;
	
	@Autowired
	PasswordEncoder pwdEncoder;
	
	@Override
	public void insertGym(GymVO vo) {
		String encodedPwd = pwdEncoder.encode(vo.getMemPwd());
		vo.setMemPwd(encodedPwd);
		
		dao.insertGym(vo);
	}

	@Override
	public String gymNoChk() {
		Random random = new Random();
		String gymNo = "";
		
		while(true) {
			String no = random.nextInt(100) + "";
			gymNo = dao.gymNoChk(no);
			
			if(gymNo == null) {
				gymNo = no;
				break;
			}
		}
		
		return gymNo;
	}

	@Override
	public GymVO getGymData(String memId) {
		return dao.getGymData(memId);
	}

	//회원가입-아이디 중복확인
	@Override
	public String joinMemIdCheck(String id) {
		return dao.joinMemIdCheck(id);
	}

	//회원가입-닉네임 중복확인
	@Override
	public String joinMemNickChk(String nick) {
		return dao.joinMemNickChk(nick);
	}
	
	@Override
	public GymVO managerLogin(HashMap<String, Object> map) {
		GymVO vo = dao.managerLogin(map);
		
		if(vo != null) {
			if(pwdEncoder.matches((String)map.get("memPwd"), vo.getMemPwd())) {
			    return vo;
			}
		}
	    
		return null;
	}
	
	//마이페이지 이미지 업데이트
	@Override
	public void updateMemImgNo(HashMap<String, Object> map) {
		dao.updateMemImgNo(map);
	}
	
	//체육관 위치정보 가져오기
	@Override
	public ArrayList<GymVO> getAllGymPosition() {
		return dao.getAllGymPosition();
	}
	
	// 체육관 이름 전체 조회
	@Override
	public ArrayList<GymVO> getAllGymName() {
		return dao.getAllGymName();
	}
	 

	//체육관 관원 등록
	@Override
	public ArrayList<GymVO> gymNameSearch(String searchWord) {
		return dao.gymNameSearch(searchWord);
	}

	@Override
	public GymVO getGymDataByName(String name) {
		return dao.getGymDataByName(name);
	}

	@Override
	public GymVO getGymPriceByGymName(String name) {
		return dao.getGymPriceByGymName(name);
	}

	@Override
	public String getGymNo(String memId) {
		return dao.getGymNo(memId);
	}
	
	
	
	
}
