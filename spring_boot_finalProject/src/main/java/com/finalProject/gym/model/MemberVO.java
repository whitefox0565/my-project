package com.finalProject.gym.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MemberVO {
	private String memId;
	private String memPwd;
	private String memName;
	private String memNick;
	private String memZipcode;
	private String memAddress1;
	private String memAddress2;
	private String memHp;
	private String memEmail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date memJoinDate;
	private String memImgNo;
	private String pointX;
	private String pointY;
	private String memCtg;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemNick() {
		return memNick;
	}
	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}
	
	public String getMemZipcode() {
		return memZipcode;
	}
	public void setMemZipcode(String memZipcode) {
		this.memZipcode = memZipcode;
	}
	public String getMemAddress1() {
		return memAddress1;
	}
	public void setMemAddress1(String memAddress1) {
		this.memAddress1 = memAddress1;
	}
	public String getMemAddress2() {
		return memAddress2;
	}
	public void setMemAddress2(String memAddress2) {
		this.memAddress2 = memAddress2;
	}
	public String getMemHp() {
		return memHp;
	}
	public void setMemHp(String memPh) {
		this.memHp = memPh;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public Date getMemJoinDate() {
		return memJoinDate;
	}
	public void setMemJoinDate(Date memJoinDate) {
		this.memJoinDate = memJoinDate;
	}
	public String getMemImgNo() {
		return memImgNo;
	}
	public void setMemImgNo(String memImgNo) {
		this.memImgNo = memImgNo;
	}
	public String getPointX() {
		return pointX;
	}
	public void setPointX(String pointX) {
		this.pointX = pointX;
	}
	public String getPointY() {
		return pointY;
	}
	public void setPointY(String pointY) {
		this.pointY = pointY;
	}
	public String getMemCtg() {
		return memCtg;
	}
	public void setMemCtg(String memCtg) {
		this.memCtg = memCtg;
	}
	
}
