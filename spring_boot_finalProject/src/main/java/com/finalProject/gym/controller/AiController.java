package com.finalProject.gym.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finalProject.gym.model.GymVO;
import com.finalProject.gym.model.MemberVO;
import com.finalProject.gym.service.GymService;
import com.finalProject.gym.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AiController {
	@Autowired
	MemberService memService;
	
	@Autowired
	GymService gymService;
	
	//지도 폼
	@RequestMapping("/ai/map")
	public String map(HttpSession session, Model model) {
		String memId = (String)session.getAttribute("sid");
		MemberVO vo = memService.getMemData(memId);
		GymVO gvo = gymService.getGymData(memId);
		ArrayList<GymVO> gymNameList = gymService.getAllGymName();
		
		double pointX = 0.0;
		double pointY = 0.0;
		String address = "";
		String userChk = "user";
		String nowUser = "";
		
		if(vo == null) {
			pointX = Double.parseDouble(gvo.getPointX());
			pointY = Double.parseDouble(gvo.getPointY());
			address = gvo.getMemAddress1();
			nowUser = gvo.getGymName();
			userChk = "manager";
		}else {
			pointX = Double.parseDouble(vo.getPointX());
			pointY = Double.parseDouble(vo.getPointY());
			address = vo.getMemAddress1();
			nowUser = vo.getMemNick();
		}
		
		model.addAttribute("pointX",pointX);
		model.addAttribute("pointY",pointY);
		model.addAttribute("address", address);
		model.addAttribute("chk", userChk);
		model.addAttribute("nowUser", nowUser);
		model.addAttribute("gymNameList", gymNameList);
		
		return "ai/mapView";
	}
	
	//등록 체육관 검색
	@RequestMapping("/ai/mapRegistGym")
	public String mapRegistGym(HttpSession session, Model model) {
		String memId = (String) session.getAttribute("sid");
		MemberVO vo = memService.getMemData(memId);
		GymVO gvo = gymService.getGymData(memId);
		ArrayList<GymVO> gymNameList = gymService.getAllGymName();

		double pointX = 0.0;
		double pointY = 0.0;
		String address = "";
		String userChk = "user";
		String nowUser = "";

		if (vo == null) {
			pointX = Double.parseDouble(gvo.getPointX());
			pointY = Double.parseDouble(gvo.getPointY());
			address = gvo.getMemAddress1();
			nowUser = gvo.getGymName();
			userChk = "manager";
		} else {
			pointX = Double.parseDouble(vo.getPointX());
			pointY = Double.parseDouble(vo.getPointY());
			address = vo.getMemAddress1();
			nowUser = vo.getMemNick();
		}

		model.addAttribute("pointX", pointX);
		model.addAttribute("pointY", pointY);
		model.addAttribute("address", address);
		model.addAttribute("chk", userChk);
		model.addAttribute("nowUser", nowUser);
		model.addAttribute("gymNameList", gymNameList);

		return "ai/mapRegistGym";
	}
	
	//지도에 합기도 위치 출력
	@ResponseBody
	@RequestMapping("/ai/getAllGymPosition")
	public ArrayList<GymVO> getAllGymPosition(){
		ArrayList<GymVO> allGymList = gymService.getAllGymPosition();
		
		return allGymList;
	}
	
	//합기도 이름 검색
	@ResponseBody
	@RequestMapping("/ai/gymNameSearch")
	public ArrayList<GymVO> gymNameSearch(@RequestParam("searchWord") String searchWord, Model model){
		searchWord = searchWord.replaceAll(" ", "");
		ArrayList<GymVO> gymNameSearchResult = gymService.gymNameSearch(searchWord);
		
		return gymNameSearchResult;
	}
}
