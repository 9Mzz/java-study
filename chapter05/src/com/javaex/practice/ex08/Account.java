package com.javaex.ex08;

public class Account {

//	필드
    private String accountNo;
    private int balance;
    
    
//  생성자 작성
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	System.out.println(accountNo+"계좌가 개설됨");
    }
    

	
//  필요한 메소드 작성	
//	메서드 gs

	
    public void deposit(int money) {
    	this.balance = balance+money;
    }
    
    public void withdraw(int money) {
    	this.balance = balance-money;
    
    }
    
    
    

    /* 내 실수를 적어두는 공간 
    필드과 메서드에 대한 개념이 잡히지 않아서 무의미한 필드와 gs 를 생성했었다.
    멋모르고 만든 필드
    private int deposit;
    private int withdraw;
    private int account;
    */
    
    
    /* 무지성으로 생성한 메서드 gs
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	*/
    
    
    
//	매서드 일반

	public void ShowBalance() {
		System.out.println(balance);
	}

}
