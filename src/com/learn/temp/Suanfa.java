package com.learn.temp;

public class Suanfa {
	
	public static void main(String[] args) {
		
//		System.out.println(feibonaqie(8));
		System.out.println("hello 1111");
	}
	
	//ì³²¨ÄÇÆõ
	
	public static int feibonaqie(int n){
		//String s="1,1,2,3,5,8,13....";
		int last1 = 1,last2=1;
		int now = 1;
		for(int i=2;i<n;i++){
			now=last1+last2;
			last1=last2;
			last2=now;
		}
		return now;
		
	}
	
	

}
