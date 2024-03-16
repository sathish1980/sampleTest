package Collections;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapConcept {

	public void mapimplementation()
	{
		//HashMap<String,String> hs = new HashMap<>();
		//LinkedHashMap<String,String> hs = new LinkedHashMap<>();
		TreeMap<Object,String> hs = new TreeMap<>();

		// add
		hs.put("firstStudent", "sathish");
		hs.put("secondStudent", "sathish");
		hs.put("thirdStudent001", "sathish");
		hs.put("thirdStudent001", "sathishR");
		hs.put("age", "99");
		hs.put("name", "raja");
		hs.put(1, "Raghu");

		System.out.println(hs);

		hs.replace("age1", "100");
		System.out.println(hs);

		// remove
		hs.remove("age2");
		System.out.println(hs);
		// retreive

		System.out.println(hs.get("fname"));

		System.out.println(hs.keySet());
		System.out.println(hs.values());
		System.out.println(hs.entrySet());
		Set<Entry<Object, String>> ls =hs.entrySet();

		for(Entry<Object, String> s: ls)
		{
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapConcept M = new MapConcept();
		M.mapimplementation();
	}

}
