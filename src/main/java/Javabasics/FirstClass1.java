package Javabasics;

public class FirstClass1 {

	// accessmodifier datatype variablename = value;

	static int agevalue;

	//whole number - int = 56 -Integer
	int a =01234567;
	//decimal value -float or double
	double b =2.3232434;
	// character -char
	char c = 's';
	// String -String
	String d ="Sathish";
	// true orfalse -boolean
	boolean e =true;

	byte f ='s';

	public FirstClass1(int age)
	{
		System.out.println("I am constructor: "+age);
	}


	public void name() //Method implementation
	{
		System.out.println("FITA");
	}

	public void Name(String firstName,int age)
	{
		System.out.println(firstName);
	}

	public int Age(int dob)
	{
		int currentyear = 2024;
		int actualAge =currentyear-dob;
		return actualAge;
	}

	public void PrintAge(int dob)
	{
		agevalue = Age(dob);
		System.out.println(agevalue);
	}

	public void actualAge()
	{
		System.out.println(agevalue);
	}

	/*
	 * Methods -Reusable purposes
	 * 1.Method with out parameter /arguments
	 * 2.Method with parameter /arguments
	 * 3.Method with out return type
	 * 4.Method with return type
	 *
	 * Syntax:
	 * accessmodifier returntype methodname(){}
	 */
	/*
	 * Main is used to exceute the program
	 */
	public static void main(String[] args)
	{
		System.out.print("sathish");
		FirstClass1 fc = new FirstClass1(34); // instantiation
		fc.name();
		fc.Name("Annanagar",12);
		fc.PrintAge(2003);
		fc.actualAge();
		/* System.out.println("kumar");
		System.out.println("kumar1");*/
	}
}