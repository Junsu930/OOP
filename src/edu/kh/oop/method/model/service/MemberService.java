package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { //클래스
	 
	// 속성(필드) 
	// 필드는 기본적으로 캡슐화 원직에 의해 private 이라는 접근제한자를 꼭 작성
	// 필드에 변수를 하나 작성하면, 클래스 안에서 어디에서든 사용 가능 
	
	private Scanner sc = new Scanner(System.in);
								//자바에서 기본적으로 지정해둔 입력장치( 키보드 ) 
	
	private Member memberInfo = null; // 가입한 회원은 정보를 저장할 변수
	
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수
	
	// 기능( 생성자, 메소드)
	
	// ** 여러 기능을 하나의 메소드에 모두 작성하지 말 것 !
	// 되도록 하나의 기능만 수행하도록 작성
	// 메소드는 한소드당 딱 하나의 기능만 가지고 있는 게 좋다.
	
	/*
	//기능별로 세분화해야 필요한 기능만 호출하여 쓸 수 있다.
	
	//public void today() { 
		// 1. 밥먹는 행위
		// 2. 일하는 행위
		
		//--> 두개의 기능이 있어 좋지 않다.
	}
	 */
	
	//public void eat() {}
	//public void work() {}
	//두가지 나눠서 메소드 만둘고 하나씩 쓸 수있다. 
	
	public MemberService() {}
	//public MemberService(int a) {} // 기본생성자 미작성시 에러
	
	// * 메서드 작성접 *
	// [접근제한자]	[예약어]		    반환형     	메소드명([매개변수]){}
	// public		static		    기본 자료형 
	// protected	final			참조형(배열, 클래스)
	// (default)	abstract		void
	// private		static final

	// ** 반환형 **
	// - 반환(return)이란? 메서드 수행 후 호출부로 돌아가는 것 
	// - 반환 값 : 돌아가면서 가져갈 결과 값
	// - 반환 형 : 반환 값의 자료형
	// -> void(텅빈 , 없는, 무효의) ; 돌려보낼 값(반환값)이 없다. 
	
	
	// 메뉴 화면 출력 기능
	
	public void displayMenu() {
		//void = 일은 수행하지만 결과 값은 없다.
		int menuNum = 0; // 지역변수 ㅇ
		
		do { 
			System.out.println("=======회원 정보 관리 프로그램=======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 >>>");
			menuNum = sc.nextInt(); // 필드에 작성된 Scanner sc 사용
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거 
		
			switch(menuNum) {
			case 1 : System.out.println(signUp());; break;
			case 2 : System.out.println(login());; break;
			case 3 : System.out.println(selectMember());break;
			case 4 : 
				// 회원 정보 수정 메서드를 수행 후
				// 반환되는 결과를 result 변수에 저장
				int result = updateMember(); // -1 or 1 or 0
				if(result == -1) {
					System.out.println("로그인 후 이용해주세요");
				} else if(result == 0 ) {
					System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
				} else {
					System.out.println("회원 정보가 수정되었습니다. ");
				}
				;break;
			case 0 : System.out.println("프로그램 종료합니다.");break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력 바랍니다.");
			}
			
		}while(menuNum != 0); // menuNum 이 0 이면 반복 종료
		
	}
	// 회원 가입 기능
	public String signUp() {
		System.out.println("*****회원 가입******\n");
		
		System.out.print("아이디 : ");
		String memberID = sc.next(); 
		
		System.out.print("비밀번호 : ");
		String memberPW = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPW2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
	
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		
		if(memberPW.equals(memberPW2)) { //일치하는 경우
			memberInfo = new Member(memberID, memberPW, memberName, memberAge);
			return "회원 가입 성공";
		} else {
			return "회원 가입 실패(비밀번호 불일치)";
		}
	}
	
	// 로그인 메서드(기능)
	public String login() {
		System.out.println("*******로그인*******\n");
		// == meberInfo가 객체를 참조하고 있는지 확인
		if(memberInfo == null) {
			return "회원가입 먼저 진행해주세요";
		}
		
		System.out.print("아이디 입력 : ");
		String memberID = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPW = sc.next();
		
		if(memberID.equals(memberInfo.getMemberID())  
				&& memberPW.equals( memberInfo.getMemberPW())) {
			
			loginMember = memberInfo;
			
			return loginMember.getMemberName()+ "님 환영합니다!";
			
		}else {
			return "비밀번호가 일치하지 않습니다.";
		}
	}
	
	// 회원 정보 조회 기능
	public String selectMember() {
		
		System.out.println("*******회원 정보*******\n");
		
		
		// 1) 로그인 여부 확인 
		// 2) 로그인이 되어있는 경우 회원정보를 출력할 문자열을 만들어서 반환
		if(loginMember == null){
			
			return "로그인을 먼저 진행해주세요";
			
		}else {
			
			String str = "ID : " + loginMember.getMemberID();    //아이디
			str += "\n이름 : " + loginMember.getMemberName(); //이름
			str += "\n나이 : " + loginMember.getMemberAge();  //나이
			
			return  str + "\n조회 완료 " ;
		}
		
	}
	

	public int updateMember() {
		
		System.out.println("\n******* 회원 정보 수정 *******:");
		
		//1)로그인 여부 판별
		//  로그인이 되어있지 않으면 -1 반환
		if(loginMember == null) {
			return -1;
		}
		
		//2)수정할 회원 정보 입력 받기(이름,나이)
		System.out.print("수정할 이름 입력 :");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		sc.nextLine();

		//3)비밀번호 입력 받아서 
		//	로그인한 회원의 비밀번호와 일치한지 확인 
		
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if( inputPw.equals( loginMember.getMemberPW())) {
			//4)비밀번호 같은 경우
			//	로그인한 회원의 이름, 나이 정보를 입력받은 값으로 변경 후 1 반환
			loginMember.setMemberName( inputName) ;
			//입력받은 inputName을 loginMeber가 참조하는 Member객체의 필드 memberName에 대입 
			loginMember.setMemberAge( inputAge) ;
			return 1;
		} else {
			return 0;
		}
		
		//5) 비밀번호가 다를 경우 0 반환 
	}
	// 회원 정보 수정 (update) 기능
	
	/*public String update() {
		
		if(loginMember!=null) {
			
		
			System.out.println("*******회원 정보*******\n");
		
			int re = 0;
		
			do {
				System.2out.println("*******정보 수정******* \n");
				System.out.println("1 : 아이디 수정 \n");
				System.out.println("2 : 비밀번호 수정 \n");
				System.out.println("3 : 이름 수정 \n");
				System.out.println("4 : 나이 수정 \n");
				System.out.println("0 : 수정 완료 \n");
				re = sc.nextInt();
			
				sc.nextLine();
				switch(re) {
		
				case 1 : {
					System.out.println("수정할 아이디를 입력하세요 ");
					String reID = sc.nextLine();
					loginMember.setMemberID(reID);
		
					return "ID 수정 완료" ;
				}
				case 2 :{
					System.out.println("수정할 비밀번호를 입력하세요");
					String rePW = sc.nextLine();
		
					System.out.println("비밀번호를 다시 입력하세요");
					String rePW2 = sc.nextLine();
					if(rePW2.equals(rePW)) {
						loginMember.setMemberPW(rePW);
						return "비밀번호 변경 완료";
				
					}else {
						return "비밀번호 변경 실패(비밀번호 확인 불일치)";
			s
					}
				}
				case 3 :{
					System.out.println("수정할 이름을 입력하세요 ");
					String reName = sc.nextLine();
					loginMember.setMemberName(reName);
			
					return "이름 수정 완료" ;
				
				}
			
				case 4 :{
					System.out.println("수정할 나이를 입력하세요 ");
					int reAge = sc.nextInt();
					loginMember.setMemberAge(reAge);
				
					return "나이 수정 완료" ;
			
				} 
				case 0 : break;
		
				}
			}while(re!=0);
			return "수정 완료";
		}else {
		
			return "로그인 먼저 진행해주세요.";
		}
	}
	*/
}
