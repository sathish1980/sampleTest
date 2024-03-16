package Inheritance;

public class FitaMainBranch {

	static String  MainBranchName = "Fita TNagar";
	String course = "Java";
	String[] courses= {"Java","Python","C#","Testing",".Net"};

	public boolean GetCourse(String expectedCourse)
	{
		//System.out.println(courses[3]);
		/*	for(int i=0;i<courses.length;i++)
		{
			System.out.println(courses[i]);
		}*/

		for(String eachVal:courses)
		{

			if(expectedCourse.equalsIgnoreCase(eachVal))
			{
				System.out.println("The given course is Exist: "+eachVal);
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitaMainBranch F = new FitaMainBranch();
		F.GetCourse(".net");
	}

}
