package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListConcpets {

	String[] name = new String[4];
	Object[] course= {"Java","python","Java"};

	public void Listimplementation()
	{
		//System.out.println(name);
		for(String eachValue:name)
		{
			System.out.println(eachValue);
		}
		name[0]="sathish";
		System.out.println(name[0]);
		name[0]="null";
		System.out.println(name[0]);

		LinkedList<String> al = new LinkedList();
		ArrayList<String> al1 = new ArrayList();
		//System.out.println(al);
		// how to add
		al.add("sathish");
		al.add("kumar");
		al.add("R");
		al.add("sathish");
		al.add(2,"FITA");
		al1.add("python");
		al1.add("java");
		al1.add("sql");
		al.addAll(al1);
		//System.out.println(al);
		//System.out.println(al1);
		System.out.println("*********************");
		// REtrieve
		System.out.println(al.get(2));
		System.out.println("*********************");
		// for each
		for(String eachValue:al)
		{
			System.out.println(eachValue);
		}
		System.out.println("*********************");
		// for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("*********************");
		//Iterator
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		// update
		al.set(4, "SATHISH");
		//System.out.println(al);

		//delete
		al.removeFirst();
		al.removeLast();
		al.remove(1);
		al.removeAll(al1);

		//System.out.println(al);

		System.out.println(al.isEmpty());
		System.out.println(al.contains("FITA"));

		LinkedList<String> Al2=(LinkedList<String>) al.clone();
		System.out.println(al.equals(Al2));
		System.out.println(al.indexOf("R"));
		//System.out.println(al.reversed());
		al.clear();
		//System.out.println(Al2);
		//System.out.println(al);

		Collections.sort(al);
		//System.out.println(al);


	}

	public static void main(String[] ar)
	{
		ListConcpets L = new ListConcpets();
		L.Listimplementation();
	}

}
