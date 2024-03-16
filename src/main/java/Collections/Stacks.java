package Collections;

import java.util.Stack;

public class Stacks {

	public void Stackimplementation()
	{
		Stack<String> s = new Stack();
		s.push("sathish");
		s.push("kumar");
		s.push("sathish");
		s.push("kumar");
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}


	public static void main(String[] a)
	{
		Stacks s = new Stacks();
		s.Stackimplementation();
	}

}
