package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
//		고객정보과 운영자 정보 배열 반복문 사용하여 출력
		
		User[] uArray = new User[3];
		
		Customer c1 = new Customer("jws","j1234","정우성",1000);
		Customer c2 = new Customer("yjs","y2345","이효리",2000);
		Employee e1 = new Employee("master","m7788","운영자",5000000);
		
		uArray[0] = c1;
		uArray[1] = c2; 
		uArray[2] = e1;
		
		for (int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		
		System.out.println(uArray[2].getName()+"의 월급은 "+e1.getsalary()+" 입니다.");
		
		
//		다운캐스팅 ((Employee)e01).getName() 
//		System.out.println(uArray[2].getName()+"의 월급은 "+((Employee.class))+((uArray)[2])+" 입니다.");
		
		/* 
		Customer[] cArray = new Customer[2];
		cArray[0]= new Customer("jws","j1234","정우성",1000);
		cArray[1]= new Customer("yjs","y2345","이효리",2000);
		
		Employee[] eArray = new Employee[1];
		eArray[0] = new Employee("master","m7788","운영자",5000000);
		
		
		for (int i=0; i<cArray.length; i++) {
			cArray[i].showInfo();
		}
		
		for (int i=0; i<eArray.length; i++) {
			eArray[i].showInfo();
		}
		
		월급값을 업캐스팅으로 불러와야 할 것 같은데 문법을 모르겠다
		System.out.println("운영자의 월급은 "+Employee.getSalary()+"원 입니다");
		System.out.println("운영자의 월급은 "+Employee.class+"원 입니다");
		*/
		
		
		
		/* 처음 만든 코드
		고객 1 2번, 운영자 객체 생성
		Customer c01 = new Customer();
		c01.setId("jws");
		c01.setPassword("j1234");
		c01.setName("정우성");
		c01.setPoint(1000);
		
		Customer c02 = new Customer();
		c02.setId("yjs");
		c02.setPassword("y2345");
		c02.setName("이효리");
		c02.setPoint(2000);
		
		Employee emp01 = new Employee();
		emp01.setId("master");
		emp01.setPassword("m7788");
		emp01.setName("운영자");
		emp01.setsalary(5000000);
		
		c01.showInfo();
		c02.showInfo();
		emp01.showInfo();
		
		배열 작성 실패
		String[] cArr = new cArr[3];
		cArr[0] = new c01;
		cArr[1] = new c02;
		cArr[2] = new emp01;
		
		*/
		
	}

}
