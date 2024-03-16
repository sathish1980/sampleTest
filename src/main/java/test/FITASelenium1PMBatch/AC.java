package test.FITASelenium1PMBatch;
import Javabasics.Operators;

public class AC extends Operators{

	// Operators O = new Operators();

	public void data(int amount , double percentage)
	{
		int a=10;
		int b=100;
		double c=a/b;
		System.out.println(c);

		double discAmoiunt = amount*percentage;
		System.out.println(discAmoiunt);
		//System.out.println(a1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC A = new AC();
		A.data(5000,0.4);
	}

}
