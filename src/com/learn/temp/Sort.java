package com.learn.temp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort {
	
	public static void main(String[] args) {
		System.out.println(555);
		Integer[] arr=new Integer[]{1,5,3,4,2,6};
		//Ã°ÅÝ
//		for(int i=arr.length-1;i>0;i--){
//			for(int j=0;j<i;j++){
//				if(arr[j]>arr[j+1]){
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
		//Ñ¡Ôñ
//		for(int i=0;i<arr.length;i++){
//			int flag=i;
//			for (int j = i; j < arr.length; j++) {
//				if(arr[j]<arr[flag]){
//					flag=j;
//				}
//			}
//			if(flag!=i){
//				int temp=arr[i];
//				arr[i]=arr[flag];
//				arr[flag]=temp;
//			}
//		}
		for(int a:arr){
			System.out.println(a);
		}
	}

}
