package com.we;

import java.util.Arrays;

public class StringDemo {
		public static void main(String[] args) {

		String a = "Manoharan";
		String b = new String("Umapathy");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.charAt(1));
		System.out.println(a.length());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a =a.concat(b);
		System.out.println(a);
		b =b.replace('m', 'M');
		System.out.println(b);
		a =a.toLowerCase();
		System.out.println(a);
		a =a.toUpperCase();
		System.out.println(a);
		String c="   Palani   ";
		System.out.println(c);
		c = c.trim();
		System.out.println(c);
		System.out.println(c.contains("i"));
		System.out.println(c.endsWith("a"));
		System.out.println(a.startsWith("MAN"));
		String d = "";
		System.out.println(a.isEmpty());
		System.out.println(d.isEmpty());
			
			/*String str="Poda Podi";
			//char[] charArray =(str.toCharArray());
		//	for(char M:charArray) {
			//	System.out.println(M);
				//Arrays.stream(str).forEach((a)->System.out.println(a));
				String[] split=str.split("");
				Arrays.stream(split).forEach((var)->System.out.println(var));*/
				
			}
		}
	


