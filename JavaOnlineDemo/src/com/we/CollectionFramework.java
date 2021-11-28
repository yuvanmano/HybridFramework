package com.we;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionFramework {
	public static void main(String []args) {
		/*String sabari[]= new String[2];
		sabari[0]="Manoharan";
		sabari[1]="Umapathy";
		for(String a: sabari) {
			System.out.println(a);
		}
		System.out.println("==================");
		Arrays.stream(sabari).forEach((a)->System.out.println(a));*/
		Collection<String> obj = new ArrayList<>();
		obj.add("Mano");
		obj.add("Palani");
		obj.add("Sabari");
		obj.add("Vicky");
		for(String a:obj) {
			System.out.println(a);
		}
		obj.forEach((a)->System.out.println(a + "kumar"));
	Iterator<String> it = obj.iterator();
	while(it.hasNext()) {
	System.out.println(it.next()+ "kumar");
	}
}
}