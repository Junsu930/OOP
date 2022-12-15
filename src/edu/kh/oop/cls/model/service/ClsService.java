package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService {
	
	// 클래스 접근제한자 확인
	public void ex1() {
		Student std = new Student();
		// public class인 Student는 import 가능
		
		// TestVO test = new TestVO
		// default 클래스인 TestVO는 import 불가 (다른 패키지이기 때문에)
		
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 v1에서만 에러가 없다.
		
	}
	
	public void ex2() {
		// static 필드 확인 예제 
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		//System.out.println(std1.schoolName);
		// public이기 때문에 직접 접근 가능
		
		System.out.println("변경 전 : " +std1.getName());
		std1.setName("김준수");
		System.out.println("변경 후 : " +std1.getName());
		
		//System.out.println(std2.schoolName);
		// public이기 때문에 직접 접근 가능
		System.out.println("변경 전 : " + std1.schoolName);
		std1.schoolName = "KH고등학교!";
		System.out.println("변경 후 : " + std1.schoolName);
	
		// schoolName에 노란 줄이 뜨는 이유 => 제대로 작성 안 해서
		// *static이 붙은 필드는 클래스.변수명 으로 사용함
		
		Student.schoolName = "김밥고등학교";
		System.out.println("Student.schoolName : " + Student.schoolName);
	
		/* static
		 * 
		 * 
		 * 1) 공유 메모리 영역 ( 또는 정적 메모리 영역 ) 이라고 함
		 * 
		 * => 프로그램 시작 시 static이 붙은 코드들이
		 * 모두 static 영역에 생성되거,
		 * 프로그램 종료될 때까지 사라지지 않음. (정적)
		 * 그리고 static 영역에 생성된 변수는 어디서든 공유 가능 (공유)
		 * 
		 * 2) 사용 법 : 클래스명.변수명
		 * 
		 */
	
		
	}
	
	public void ex3() {
		//생성자 확인 테스트 
		
		Student s1 = new Student();
					// 기본 생성자
		
		//User 기본 생성자를 이용해서 객체 생성
		User u1 = new User();
		
		//User 객체 필드 초기화 확인
		//클래스에 getter/ setter를 통해서만 접근
		
		User u2 = new User();
		
		
		System.out.println(u1.getUserID());
		System.out.println(u1.getUserPW());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		System.out.println("============================");
		
		// 문제점 : u1이 참조하고있는 User 객체와
		//		  u2가 참조하고 있는 User 객체가 필드의 값이 모두 동일함
		//		  같은 기본생성자로 User 객체 생성했기 때문
		
		// 해결방법 1 : setter를 이용해서 새로운 값을 대입
		
		u2.setUserID("junsu");
		u2.setUserPW("wnstn");
		u2.setUserName("준수");
		u2.setUserAge(29);
		u2.setUserGender('M');
		
		System.out.println(u2.getUserID());
		System.out.println(u2.getUserPW());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		System.out.println("============================");
		// 해결방법 2 : 매개변수 생성자를 사용 
		User u3 = new User("junsu123", "wnstn", "준수", 29, 'M');
		
		System.out.println(u3.getUserID());
		System.out.println(u3.getUserPW());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
	}
	
}
