package com.gyeom.dto;

import java.util.Date;
//테이블을 Class로 사상시킴
public class MemberVO {
	// 사용자가 입력하는 정보
	private String id; // 아이디
	private String pwd; // 비밀번호
	private String email; // 이메일
	private String phone; // 전화번호
	private String name; // 이름
	private String address; // 주소

	// 시스템에서 처리하는 정보, 관리자가 관리하는 정보
	private Date regDate; // 등록일

	public MemberVO() {
	}

	public MemberVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone 
				+ ", address=" + address + "]";
	}
}
