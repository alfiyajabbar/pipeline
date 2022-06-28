package interviewQuestions.test;

public class SwapThreeNumbersToFirstInArray {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	for(int j=0;j<3;j++)
	{
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{
	      a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}
	for(int data:a)
	{
		System.out.print(data);
	}
}
}
