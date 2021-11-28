package com.web;

interface Father
{
	public void movableAsset ();
	public void immovabelAsset();
}
public class Son implements Father
{
String gold ="12 grams";
String land ="5 acres";
String cars ="3 cars";
public void vehicles()
{
	System.out.println("Son Has" + cars);
}
public void movableAsset()
{
	System.out.println("Son Has" + gold);
}
public void immovableAssest()
{
	System.out.println("Son Has" + land);
}
public static void main(String [] args)
{
Son s = new Son();
s.immovabelAsset();
s.immovabelAsset();
s.vehicles();
}
}

