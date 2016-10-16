package com.java.functional;

import java.util.stream.Stream;

class podu
{
	public void m2()
	{
		System.out.println("him2" );
	}
	
	private void m3()
	{
		System.out.println("him3" );
	}
	
	protected void m4()
	{
		System.out.println("him4" );
	}
	
	void m5()
	{
		System.out.println("him5" );
	}
}
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=3;
boolean b1=true;
boolean b2=false;
if((b1|b2)||(x++>4))
{
	System.out.println("ola"+x++);
}
if((!b1 &b2) && (++x<4))
{
	System.out.println("pola");
}


	}

}
