package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Setconcepts {
	public void setimplementation()
	{
		//HashSet<String> hs = new HashSet<>();
		//LinkedHashSet<String> hs = new LinkedHashSet<>();
		TreeSet<String> hs = new TreeSet<>(Collections.reverseOrder());

		hs.add("sathish");
		hs.add("sathish");
		hs.add("kumar");
		hs.add("");
		hs.add("R");

		System.out.println(hs);

		//update
		// not availalbe
		//remove
		hs.remove("kumar");

		System.out.println(hs);

		// retreive
		//System.out.println(hs.get());
		System.out.println("*********************");
		// for each
		for(String eachValue:hs)
		{
			System.out.println(eachValue);
		}
		System.out.println("*********************");
		// for loop
		/*for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}*/
		System.out.println("*********************");
		//Iterator
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("R"));



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setconcepts s = new Setconcepts();
		s.setimplementation();
	}

}
