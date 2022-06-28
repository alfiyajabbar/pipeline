package interviewQuestions.test;

public class FirstAndSecondHighestWithoutSort {
public static void main(String[] args) {
	int a[]= {30,10,40,50,20};
	int fmax=a[0];
	int smax=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(fmax<a[i])
		{
			smax=fmax;
			fmax=a[i];
		}
		else if(smax<a[i])
		{
			smax=a[i];
		}
	}
	System.out.println(fmax+" "+smax);
}
}
