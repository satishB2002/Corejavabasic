package Test_04;
/*Q6. Write a Java program to display the elements and their positions in a
linked list.*/

import java.util.LinkedList;

public class Q {
public static void main(String[] args) {
	LinkedList<Integer> ls=new LinkedList<Integer>();
	ls.add(789);
	ls.add(958);
	ls.add(684);
	ls.add(159);
	ls.add(735);
	ls.add(562);
	System.out.println("Element\tPOsition");
	System.out.println(ls.get(0)+" \t1 ");
	System.out.println(ls.get(1)+" \t2 ");
	System.out.println(ls.get(2)+" \t3 ");
	System.out.println(ls.get(3)+" \t4 ");
	System.out.println(ls.get(4)+" \t5 ");
	System.out.println(ls.get(5)+" \t6 ");
}
}
