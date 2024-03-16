package Javabasics;

import java.sql.SQLException;

public  class ExceptionHandling {
	public final int age =30;

	public final void increaseAge(int increase)
	{
		System.out.println(age);
		//age=age+increase;
	}

	public int add(int a , int b)
	{
		try
		{
			System.out.println("Addition is: "+(a+b));
		}
		catch(Exception error)
		{
			System.out.println(error);
		}

		return 12;
	}
	public void sub(int a , int b) throws ArithmeticException,SQLException
	{
		System.out.println("sub is : "+(a-b));
	}

	public void div(int a, int b)
	{
		try {
			System.out.println("Divison is: "+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("You have give incorrect denominator : " + b);
		}
		catch(Exception e)
		{
			System.out.println(e);
			add(a,b);
		}
		finally
		{
			System.out.println("finally");
		}

	}

	public void voterid(int age)
	{
		if(age>18)
		{
			System.out.println("You are eligible to apply voter id");

		}
		else
		{
			throw new ArithmeticException("invalid age");
			// System.out.println("sathish");
		}
	}

	public static void main(String[] args) throws ArithmeticException, SQLException {
		// TODO Auto-generated method stub
		ExceptionHandling E = new ExceptionHandling();
		E.add(2, 3);
		E.div(3,0);
		E.sub(3, 2);
		E.voterid(19);
	}

}
