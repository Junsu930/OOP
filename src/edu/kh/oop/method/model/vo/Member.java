package edu.kh.oop.method.model.vo;

public class Member {
	
	//필드
	private String memberID;
	private String memberPW;
	private String memberName;
	private int memberAge;
	
	// 생성자
	// 기본생성자
	// 기본생성자 : 반환형이 없고 클래스와 이름이 같아야한다.
	public Member (){} 

	// 매개변수 생성자
	public Member(String memberID, String memberPW, String memberName, int memberAge) {

		this.memberID = memberID;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberAge = memberAge;
		
		
	//메서드
	}

	public String getMemberID() {
		return memberID;
	}
	// 매개변수로 전달받은 값을 memberID 필드에 대입
	// 매개변수(== 전달받은 값을 지니고 있는 변수)
	public void setMemberID(String memberID) {
				// set + 필드명 (카멜케이스 적용) 
		this.memberID = memberID;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
}