package interviewQuestions.test;

public class Seggregation {
	public static void main(String[] args) {
		String s="a1#b2@c3$";
		System.out.println(s);
		String alpha="";
		String number="";
		String special="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
		if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z')
		{
			alpha=alpha+ch;
		}
		else if(ch>='0'&&ch<='9')
		{
			number=number+ch;
		}
		else
		{
			special=special+ch;
		}
	}
	System.out.println(alpha);
	System.out.println(number);
	System.out.println(special);

}
}
