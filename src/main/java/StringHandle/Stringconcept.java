package StringHandle;

public class Stringconcept {

	String name ="Sathisha";
	String name2 = "Sathisaa";
	int age =30;
	String a;
	String b = null;
	//StringBuffer sB = new StringBuffer("Annanagar");
	StringBuilder sB = new StringBuilder("Annanagar");


	/*
	 * Strings are immutable - not changeable
	 */

	public void Stringimplementation()
	{
		System.out.println(name);
		//name = name +" kumar";
		System.out.println(name);
		// methods
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(1));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.contains("a"));
		System.out.println(name.substring(2,5));
		System.out.println(name.substring(2));
		char[] charValue =name.toCharArray();
		int count=0;
		for (char eachchar : charValue)
		{
			count=count+1;
			if(eachchar=='a')
			{
				System.out.println("The given a is present in ; "+count);
			}
		}
		System.out.println(name.startsWith("S"));
		System.out.println(name.endsWith("S"));
		System.out.println(name.concat(name2));
		//name =name.concat(name2);
		System.out.println(name);
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.compareTo(name2));
		System.out.println(name==name2);
		for(byte eachvalu:name.getBytes())
		{
			System.out.println(eachvalu);
			System.out.println((char)eachvalu);
		}
		System.out.println(name.replace("athyiuf", "A"));
		String ag =String.valueOf(age);
		System.out.println(ag.length());
		sB.append("Chennai");
		sB.reverse();
		System.out.println(sB);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringconcept s = new Stringconcept();
		s.Stringimplementation();
	}

}
