package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner (System.in);
	
	private  SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		// 사용자가 입력한 정보를 받는다.
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		//사용자가 입력한 정보 저장
		
		char yon = '0';
		while(yon != 'n') {
		
			System.out.print("저장한 정보를 확인하겠습니까?(y/n) : ");
		
			yon = sc.next().charAt(0);
		
			if(yon == 'y' || yon == 'Y') {
			
				System.out.println(scr.confirmData());
				break;
				//y를 눌렀을 때 
			}else if (yon == 'n' || yon == 'N') {
		
				break;
		
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}		
	}
}


