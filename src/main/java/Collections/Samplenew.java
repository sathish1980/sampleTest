package Collections;

public class Samplenew extends sample{

	public void mul()
	{
		System.out.println("mul");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s = new Samplenew();
		Samplenew s1 = new Samplenew();
		s.sub();
		s1.mul();
	}


}
