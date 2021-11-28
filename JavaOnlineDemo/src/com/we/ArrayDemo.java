package com.we;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		/*int mano[] = new int[5];
		mano[0]= 5;
		mano[1]=10;
		mano[2]=6;
		mano[3]=5;
		mano[4]=19;
		System.out.println(mano[4]);
		int[]num;
		num= new int[2];
		num[0]=1;
		num[1]=2;
		System.out.println(num[0]);
		int mano[]= {20,30,40,50,60};
		System.out.println(mano[3]);
		int num[][]={ {20,30,39},
				{20,57,68},
				{899,788,78}};
System.out.println(num[2][1]);
		int num[][]= {{20,30,40,50,60},
				      {29,55,78,90},
				      {12,34,56},
				      {50,89},
				      {1}};
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				//System.out.println(" " +num[i][j]);
			}
			System.out.println(num[i].length);*/
		String[] mano= new String[2];
		mano[0]= "sabari";
		mano[1]="jothi";
		Arrays.stream(mano).forEach((a)->System.out.println(a));
		System.out.println("==========================");
		Iterator<String> it = mano.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
	
			}
			
		}
				

	


