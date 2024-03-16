package OOPS;

public class implementation extends Abstractionclass{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=b-a;
		System.out.println(c);

	}


	public void mul()
	{
		System.out.println("This is multiply");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractionclass i = new implementation();
		i.sub();
		i.add();
		implementation i1 = new implementation();
		i1.mul();
	}


}
