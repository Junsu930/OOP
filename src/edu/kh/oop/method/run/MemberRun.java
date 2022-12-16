package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {
	
	
//[접근 제한자][예약어]반환형 메서드명 ([매개변수])
	public static void main(String[] args) {
		
		
		MemberService service = new MemberService();
		//MemberService 의 기본생성자가 작성되어 있지는 않지만
		//문제없이 사용 가능 ! (컴파일러가 자동으로 생성)
		
		//!주의 
		// 생성자가 하나라도 있으면 기본 생성자가 자동생성해주지 않는다! 
		
		service.displayMenu();
	}

}
