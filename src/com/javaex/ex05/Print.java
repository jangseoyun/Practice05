package com.javaex.ex05;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }
    //메소드  3개 를 작성하세요
    //메소드 오버로딩
    
    public void printer(boolean action) {
    	System.out.println(action);
    }
    
    public void printer(double point) {
    	System.out.println(point);
    }
    
    public void printer(String name) {
    	System.out.println(name);
    }
    
}
