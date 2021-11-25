package com.javaex.ex06;
//static 필드와 메소드를 이용 
public class CConverter {
    //필드
	
	//생성자
	
	//메소드 g,s
	
	//메소드 일반
    public static double rate;
    
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    
    
    
    
    
    

}
