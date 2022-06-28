package interviewQuestions.test;

public class maxLengthStringArray {
	public static void main(String[] args) {
		String str[]= {"hello","hi","abc","welcome","tyss"};
		String max=str[0];
		for(int i=0;i<str.length;i++)
		{
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		System.out.println(max);
	}

}
