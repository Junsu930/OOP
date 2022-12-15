package edu.kh.oop.cls.model.vo;

public class User {
	
	//필드 
	// == 속성
	
	// 아이디, 비밀번호, 이름, 나이, 성별
	// 추상화 
	
	private String userID;
	private String userPW;
	private String userName;
	private int userAge;
	private char userGender;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public char getUserGender() {
		return userGender;
	}

	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}


	// 생성자
	// 기본 생성자
	public User() {
		//필드 초기화 + 기능
		userID = "user01";
		userPW = "pass01";
		userName = "김갑환";
		userAge = 20;
		userGender = 'M';
		
	}
	
	// 매개변수 생성자 
	// ** 사용되는 기술, 변수 : 매개변수, overloading(오버로딩) , this
	// ** 매개변수 : 생성자나 메서드 호출 시 () 안제 작성되어 전달되어지는 값을 저장하는 변수
	// -> 전달 받은 값을 저장하는 있는 매개체 역할의 변수 
	
		
	public User(String UserID, String UserPW, String userName, int userAge, char userGender) {
		this.userID = UserID;
		this.userPW = UserPW;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}

	
	// getter/setter 자동 완성
	// alt + shift + s  -> Generate Getters and Setters
	// 메서드 

}
