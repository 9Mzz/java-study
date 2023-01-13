package com.javaex.ex08;

import java.util.Scanner;

//	코드 에러는 잡았으나 입금 출금 저장이 안된다 뭐가 문제일까?

public class AccountApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money;
        
        Account account = new Account("312-89562-123456");
        
        while(run){
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");
            
            int menuNo = sc.nextInt();
            
            switch(menuNo){
            
                case 1:
                    System.out.print("예금액>");
                    money = sc.nextInt();
                    account.deposit(money);
                    break;
                
                case 2:
                    System.out.print("출금액>");
                    money= sc.nextInt();
                    account.withdraw(money);
                    break;
                    
                case 3:
                    System.out.print("잔고액>");
                    account.ShowBalance();
                    break;
                
                case 4:
                    System.out.print("프로그램 종료");
                    run = false;
                    break;
                    
                default :
                    System.out.println("다시입력해주세요");
                    break;
                    
            }//switch 
            
        }//while
        sc.close();
    }

}
