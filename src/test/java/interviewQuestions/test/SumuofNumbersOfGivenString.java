package interviewQuestions.test;

public class SumuofNumbersOfGivenString {
public static void main(String[] args) {
	String s="a1#b2@c3$";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>'0'&& s.charAt(i)<='9')
		{
			int n=s.charAt(i)-48;
			System.out.println(n);
			sum=sum+n;
		}
	}
	System.out.println("sum of given numbers"+"--->"+sum);
}
}
