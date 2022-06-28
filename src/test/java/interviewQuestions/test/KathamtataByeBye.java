package interviewQuestions.test;

import java.util.LinkedHashSet;

public class KathamtataByeBye {
	public static void main(String[] args) {
		String s="katham Ta ta Bye bye";
		String str[]=s.split(" ");
		
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String word:set) {
			for(int i=0;i<str.length;i++)
			{
				if(word.equalsIgnoreCase(str[i]))
				{
					System.out.println(word+" "+(i+1));
					break;
				}
			}
		}
	}
	}

