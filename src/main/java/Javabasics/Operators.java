package Javabasics;

public class Operators {

	private int a1 = 20;

	public int getRate()
	{
		return a1;
	}

	public void setRate(int rate)
	{
		this.a1=rate;
	}

	private void Add()
	{
		int a = 10;
		int b = 20;
		int c = a1+b;
		System.out.println(c);

	}

	public void sub()
	{
		int a = 10;
		int b = 20;
		int c = a-b;
		System.out.println("Sub of : "+c);
	}

	public void Gender(String name,int age)
	{
		Add();
		//if(!(name=="Sathish" || age>18))
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators O = new Operators();
		O.Add();
		O.sub();
	}

}
