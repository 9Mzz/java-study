package com.javaex.ex02;

public abstract class Bird {
    private String name;
//    private String fly;
//    private String song;


//	public Bird(String name) {
//		this.name = name;		
//	}
	

	
	protected final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	
	
	/*
	 * public final String getSing() { return sing; }
	 * 
	 * public final void setSing(String sing) { this.sing = sing; }
	 * 
	 * public final String getFly() { return fly; }
	 * 
	 * public final void setFly(String fly) { this.fly = fly; }
	 */


	public abstract void sing();
    public abstract void fly();
    public abstract void showName();
    
    
	/*
	 * public void showName() { System.out.println("이름은 :"+name); }
	 */


	
	
	
}
