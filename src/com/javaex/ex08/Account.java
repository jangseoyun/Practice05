package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
	
    //생성자 작성
    
    public Account() {
    	
    }
    
    public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    
	public Account(String accountNo) {
		this(accountNo, 0);
	}
	
    //필요한 메소드 작성
	public int deposit(int dps) {
		balance = (balance+dps);
		
		return balance;
	}
	
	public int withdraw(int wdrw) {
		balance = (balance-wdrw);
		
		return balance;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}	

}
