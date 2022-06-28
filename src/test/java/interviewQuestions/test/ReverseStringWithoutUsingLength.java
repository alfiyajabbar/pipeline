package interviewQuestions.test;

public class ReverseStringWithoutUsingLength {
 public static void main(String[] args) {
	String s="india";
	char ch[]=s.toCharArray();
	String rev="";
	for(char ch1:ch)
	{
		rev=ch1+rev;
	}
	System.out.println(rev);
}
}
