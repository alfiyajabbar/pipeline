package interviewQuestions.test;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String s=" india Welcome to india";
		String str[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String word:set)
		{
			System.out.print(word+" ");
		}
}
}
