package Inheritance;

public class Calculator {

	private int age=20;

	public int getAge()
	{
		return this.age;
	}

	public void setterAge(int age)
	{
		this.age=age;
	}


	public void add(int a,int b)
	{
		System.out.println("2 param");
		System.out.println(a+b);
	}

	public void add(double a,int b)
	{
		System.out.println("2 param with decimal");
		System.out.println(a+b);
	}

	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator C =new Calculator();
		C.add(4,6);
	}

}
