package interviewQuestions.test;

import java.util.LinkedHashSet;

public class NumberOfOccurrenceOfEachCharacterFromString {
public static void main(String[] args) {
	String s="india";
	//step1:
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));//adding data to set
	}
	//step:2
	for(char ch:set)//read data from set
	{
		int count=0;
		
			for(int i=0;i<s.length();i++)//read character from given string
			{
				if(ch==s.charAt(i))//checking data of set and string.
				{
					count++;// if equal increment the count
				}
			}
			//step:3
			System.out.println(ch+"----> "+count);
		}
	}
	
	
	
}


