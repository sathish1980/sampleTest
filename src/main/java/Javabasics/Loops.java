package Javabasics;

public class Loops {

	public void forloop(int firstNumber)
	{
		int condition =20;
		/*for(int i=firstNumber;i>=firstNumber-10;i--)
		{
			System.out.println(i);
		}*/

		/*for(int i=firstNumber;i<=condition+10;i++)
		{
			System.out.println(i);
		}*/

		for(int i=firstNumber;i<=firstNumber+10;i++)
		{
			if(i==105 || i==109)
			{
				continue;
			}

			System.out.println(i);
		}
	}

	public void whilecondition(int firstnumber)
	{
		int i=firstnumber;
		while(i<=100+10)
		{
			if(i==105)
			{
				continue;
			}
			i=i+1;
			System.out.println(i);

		}
	}


	public void dowhile(int firstnumber)
	{
		int i=firstnumber;
		do
		{
			i=i+1;
			if(i==105)
			{
				continue;
			}

			System.out.println(i);

		}while(i<=100+10);
	}



	public int nestedForloop(int firstNumber)
	{
		boolean identifier=false;
		for(int i=firstNumber;i<=firstNumber+10;i++)
		{
			System.out.println(i);
			for(int j=firstNumber;j<=firstNumber+10;j++)
			{
				System.out.print(j);
				if(j==105)
				{
					identifier=true;
					return 1;
				}

			}
			/*if(identifier==true)
			{
				break;
			}*/
			System.out.println("\n");


		}
		return 0;
	}
	public static void main(String[] args) {
		Loops l = new Loops();
		l.nestedForloop(100);
	}

}
