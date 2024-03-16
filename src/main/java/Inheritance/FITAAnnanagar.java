package Inheritance;

public class FITAAnnanagar extends FitaMainBranch{

	String AnnaNagarBranchName = "FITA Annanagar";

	String[] coursesFees= {"Java-10000","Python-15000","C#-20000","Testing-13000",".Net-30000"};

	//FitaMainBranch FM = new FitaMainBranch();

	public void SplitCourseAndFees(String Course)
	{
		System.out.println(MainBranchName);
		if(GetCourse(Course))
		{
			GetCourseFees(Course);
			return;
		}
		System.out.println("The given Course: " +Course+" is not avaialbe at the moment");
	}
	public void GetCourseFees(String Course)
	{
		for(String eachCourse:this.coursesFees)
		{
			//System.out.println(eachCourse);
			String[] AfterCourseFeeSplit =  eachCourse.split("-");
			if(Course.equalsIgnoreCase(AfterCourseFeeSplit[0]))
			{
				System.out.println("The Fees for the selected Course "+Course+" is : "+AfterCourseFeeSplit[1]);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FITAAnnanagar F = new FITAAnnanagar();
		F.GetCourse("JAVA");
		F.SplitCourseAndFees("c#");

	}
}
