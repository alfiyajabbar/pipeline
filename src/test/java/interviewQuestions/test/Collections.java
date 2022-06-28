package interviewQuestions.test;

import java.util.ArrayList;

public class Collections {
public static void main(String[] args) {
	ArrayList<Object> list=new ArrayList<Object>();
	list.add(20);
	list.add("aba");
	list.add('d');
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	ArrayList<Object> list1=new ArrayList<Object>();
	list1.add(20);
	list1.add("ab");
	list1.add('d');
	list.retainAll(list1);
	System.out.println(list);
	
}
}
