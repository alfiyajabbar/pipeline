package interviewQuestions.test;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String s="india";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) 
		{
			set.add(s.charAt(i));
		}
		for(char k:set)
		{
			System.out.print(k+" ");
		}
}
}
