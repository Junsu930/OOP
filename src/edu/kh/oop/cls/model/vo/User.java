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
	//인스턴스 변수이다
	//cf) static 이 붙은 필드의 변수를 클래스 변수라고 한다. 
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
	
		
	public User(String userID, String userPW) {
		this.userID = userID;
		this.userPW = userPW;
		// 매개 변수로 전달받은 값을 필드에 초기화(this 참조변수)
		
		// *** this 참조 변수 ***
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수 
		// - 모든 객체 내부에 숨겨져있다. 
		// 사용 이유는?
		// -> 필드명과 매개변수 명이 같은 경우 
		// 이를 구분하기 위해서 주로 사용
	}
	
	public User(String userID, String userPW, String userName, int userAge, char userGender ) {
		
		//this.userID = userID;
		//this.userPW = userPW;
		
		this(userID,userPW); 
		//this 생성자 - 같은 클래스의 다른 생성자를 호출할 때 사용 
		// - 생성자 내에 반드시 첫째 줄에 작성되어야 한다 
		// 사용 이유 - 코드 길이 감소, 재사용성 증가 (가독성의 문제로 잘 사용하지는 않음)
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		
	}
	
	// toString 은 반환값 return 으로 객체를 불러올 때 작성한 String 형을 불러옴
	public String toString() {
		return"";
	}
	
	// * 자바 * 
	// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용하지 않음

	// ***오버로딩 (overloading)
	// - 클래스 내에 동일한 이름의 메서드(생성자 포함)를 여러개 작성하는 기법
	// -> 하나의 이름으로 여러 기능을 수행할 수 있게 한다. 
	
	// [오버로딩 조건]
	// 1) 메서드(생성자 포함)의 이름이 동일
	// 2) 매개변수의 개수, 타입, 순서 중 1개라도 달라야 함.
	
	//public User(){} // 기본생성자를 위에 작성해서 중복으로 인식 
	
	public User(String userID) {} // 매개 변수의 개수가 같은 생성자 없음 
								  // -> 오버로딩 성립 
	
	public User (int userAge) {}  // 매개변수 개수는 같지만 타입이 다름
								  // -> 오버로딩 성립
	
	public User (String userID, int userAge) {}
	// 매개변수의 개수가 위에 같은 것이 있으나 ,매개변수의 타입이 다름
	// 오버로딩 성립 
	
	//public User(int userAge, String userID) {}
	// 매개변수의 개수와 타입은 같으나, 순서가 다름 -> 오버로딩 성립 
	
	//public User(int userAge, String userName) {}
	// 매개변수의 개수, 타입, 순서가 같음 -> 오버로딩 불가
	// -> 변수명은 신경쓰지 않는다!
	
	public User(String userID, String userPW, String userName) {}
	//public User(String userName, String userID, String userPW) {}
	
	// getter/setter 자동 완성
	// alt + shift + s  -> Generate Getters and Setters
	// 메서드 

}
