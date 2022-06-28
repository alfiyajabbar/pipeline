package interviewQuestions.test;

public class PatternIndia {
	public static void main(String[] args) {
		String s="india";
		String pattern="";
		for(int i=0;i<s.length();i++)
		{
			pattern=pattern+s.charAt(i);
			System.out.println(pattern);
		}
	}

}
