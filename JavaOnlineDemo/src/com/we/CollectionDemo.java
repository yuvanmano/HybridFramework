package com.we;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
public static void main(String[] args) {
	List<Integer> obj1= new ArrayList<>();
	obj1.add(10);
	obj1.add(20);
	obj1.add(30);
	obj1.add(40);
	obj1.add(50);
	System.out.println(obj1);
	List<Integer> obj2= new ArrayList<>();
	obj2.add(60);
	obj2.add(80);
	obj2.add(70);
	obj2.add(90);
	obj2.add(100);
	//obj2.addAll(obj1);
	System.out.println(obj2);
	
	System.out.println(obj1.size() + " " + obj2.size());
	System.out.println(obj1.equals(obj2));
	System.out.println(obj1.containsAll(obj2));
	System.out.println(obj2.removeAll(obj1));
	System.out.println(obj1 + ""+obj2);
	obj1.add(1,88);
	System.out.println(obj1);
	int d = obj1.get(3);
	System.out.println(d);
	for (int i=0;i<obj1.size();i++) {
		System.out.println(obj1.get(i));
		
	}
}
}
