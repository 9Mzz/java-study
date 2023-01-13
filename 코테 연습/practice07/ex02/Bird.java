package com.javaex.ex02;

public abstract class Bird {
    
	protected String name;

    public abstract String getName();
    
    public abstract void setName(String name);

	public abstract void fly();
	
	public abstract void sing();
	
	public abstract void showName();
}
