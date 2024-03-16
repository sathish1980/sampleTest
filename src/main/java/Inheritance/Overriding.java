package Inheritance;

public class Overriding extends Calculator{


	@Override
	public void add(double d, int z)
	{
		System.out.println(d-z);
	}


	public void GetMyAge()
	{
		System.out.println(getAge());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding O = new Overriding();
		O.add(2, 4);
		Calculator c = new Calculator();
		c.add(2, 4);
	}

}
