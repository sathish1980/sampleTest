package StringHandle;

public class arrayConcepts {

	int[][] age= {{23,45},{34,32}};
	int[] age1= new int[50];

	public void GetArray()
	{
		age1[0]=10;
		for(int eachValue:age1)
		{
			System.out.println(eachValue);
		}
		for(int i=0;i<age.length;i++)
		{
			for(int j=0;j<age.length;j++)
			{
				System.out.println(age[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayConcepts a = new arrayConcepts();
		a.GetArray();
	}

}
