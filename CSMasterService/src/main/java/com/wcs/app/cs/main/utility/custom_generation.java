package com.wcs.app.cs.main.utility;

public class custom_generation 
{
	public String getid(String s)
	{
		System.out.println("branch code"+s);
		  String s1=s.substring(0,3);
		  String s2=s.substring(3);
		  System.out.println(s2);
		  int a=Integer.parseInt(s2); 
		  a++; 
		  //String st=s.valueOf(a);
		  String st=s1+a;
		  System.out.println(st);
		  //String s3=s1.concat(st); 
		  s=st;
		  return s;
		 
	}
}
