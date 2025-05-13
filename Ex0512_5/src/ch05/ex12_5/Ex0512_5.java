package ch05.ex12_5;
import java.util.*;
public class Ex0512_5 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
//		list1.add(new Integer(5)); 예전에는 이렇게 썼음, 제네릭?
		list1.add(5);	list1.add(4);	list1.add(2);	list1.add(0);	list1.add(1);	list1.add(3);
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		
		System.out.println("list1="+list1); // [5,4,2,0,1,3]

		System.out.println("list2="+list2); // [4,2,0]
		
		list2.add("B");
		System.out.println("list2="+list2); // [4,2,0,B]
		
		list2.add(2,"C");
		System.out.println("list2="+list2); // [4,2,C,0,B]

	}

}
