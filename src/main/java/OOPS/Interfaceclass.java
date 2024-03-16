package OOPS;

public class Interfaceclass extends Abstractionclass implements Course,NewCourse{
	@Override
	public void morningBatch() {
		// TODO Auto-generated method stub
		System.out.println("I am morning batch");
	}

	@Override
	public void eveningBatch() {
		// TODO Auto-generated method stub
		System.out.println("I am evening batch");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Interfaceclass();
		c.morningBatch();
		NewCourse c1 = new Interfaceclass();
		c1.eveningBatch();

	}

	@Override
	public void weekendbatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub

	}



}
