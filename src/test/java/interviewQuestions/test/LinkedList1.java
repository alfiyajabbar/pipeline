package interviewQuestions.test;
import java.util.LinkedList;
public class LinkedList1 {
public static void main(String[] args) {
	LinkedList<Object> list=new LinkedList<Object>();
	list.add(20);
	list.add('c');
	list.add("xyz");
	System.out.println(list);
	list.addLast("bye");
	System.out.println(list);
	list.addFirst("hello");
	System.out.println(list);
}
}
