package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s = new Snack();
	// Snack 기본 생성자를 통해서 Snack 객체 이용할 변수 생성
	public SnackController() {}
	//기본 생성자 생성
	public String saveData(String kind, String name, String flavor,
			int numOf, int price) {
		
		// 저장하는 매개변수 생성자
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료";
		
	}
	
	public String confirmData() {
		
		return s.information();
	
		// 정보 출력
	}
	

}
