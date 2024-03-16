package Javabasics;

public class AccesmodifierCheck extends Operators {

	public void GetData()
	{
		setRate(40);
		System.out.println(getRate());
		sub();
		//Add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesmodifierCheck A = new AccesmodifierCheck();
		A.GetData();
	}

}
