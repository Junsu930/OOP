package com.kh.test.money.model.vo;

public class Money {
	
	public final static String UNIT = "원";
	
	private int money;
	
	
	public Money(){}
	public Money(int money) {}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void print() {
		System.out.println(money + UNIT);
	}	
	
}