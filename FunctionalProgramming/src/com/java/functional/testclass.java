package com.java.functional;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class parent
{
	protected static int count=0;
	protected int y=8;
	public parent()
	{
		
	count++;	
	}
	
	
	static int getCount()
	{
		return count;
	}
	
	private Number getHi(String h,boolean b)
	{
		System.out.println("");
		
		return null;
	}
}
public class testclass extends parent {
int x=0;
private int r =0;

	public Integer getHi(String h,boolean b)
	{
		return null;
	}
	
	public testclass()
	{super();
		count++;
	}
	private static int count;
	static{
		System.out.println("in block 1");
		count=10;
	}
	
	private int[]data;
	{
	System.out.println("in block 2");
	data = new int[count];
	for(int i =0;i<count;i++)
	{
		data[i]=i;
	}
	}
	
	public void meth(String[] arg)
	{
		System.out.println("in side methos");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=6;
	
		
StringBuilder  b = new StringBuilder();
for(String h :args)
{
	if(b.indexOf(h)<1)
	{
		b.append(h+"");
	}
	System.out.println("vush"+h.toString());
	Scanner v = new Scanner(h.toString());
	while(v.hasNext())
	{
		if(v.hasNextInt())
		{
			System.out.println("hush"+v.nextInt()+"");
		}
		else {
			v.next();
		}
	}
}
	
	parent po = new parent();
	po.y=7;
		
System.out.println("Count"+getCount());
System.out.println("before first call to new");
testclass t1 = new testclass();
System.out.println("val of x"+t1.x);
System.out.println("Count"+getCount());
	testclass t2 = new testclass();
	
	String f ="first";
	String sec = new String("first");
	"first".concat("sec");
	System.out.println(f.equals(sec));
	System.out.println(f==sec);
	System.out.println(f.equals("firstsec"));
	System.out.println(sec=="first");
	Double d=null;
	System.out.println((d instanceof Double)?"true":"false");		
	
	
	short c= 2;
	switch(c)
	{
	case(0):System.out.print(0);
	case(1):System.out.print(1);
	}
	
	String h =null;
	String n= new String("Ayon");
	System.out.println(h.length());
	
	}
	

}
