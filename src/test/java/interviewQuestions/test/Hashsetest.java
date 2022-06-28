package interviewQuestions.test;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetest {
	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(10);
		hs.add('A');
		hs.add("hi");
		hs.add(10);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		Iterator<Object> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
