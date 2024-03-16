package Javabasics;

public class IfConditions {

	int a=10;

	public void ifconditions(String color,String vehicle,boolean patient)
	{
		if(color=="Green")
		{
			System.out.println("You ar good to go");
		}
		else if(color=="Red")
		{
			if(vehicle=="ambulance" && patient==true)
			{
				System.out.println("Please give a way !! i am ambulance");

			}
			else
			{
				System.out.println("You have to stop now!!!!");

			}
		}
		else if(color=="Orange")
		{
			System.out.println("Get Ready to Go/STop");
		}
		else
		{
			System.out.println("You have given an incorrect color");
		}

		System.out.println("iF condition");
	}

	public void switchConditions(String Gendercode)
	{

		switch(Gendercode)
		{
		case "M":
			System.out.println("You are Male");
			break;
		case "F":
			System.out.println("You are FeMale");
			break;
		case "T":
			System.out.println("You are Tansgender");
			break;
		default:
			System.out.println("This is not a valid gender code");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfConditions i = new IfConditions();
		i.ifconditions("Red","ambulance",true);
		i.switchConditions("F");
	}

}
