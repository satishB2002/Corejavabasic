package Test_04;

import java.util.ArrayList;

//Q2. Write a Java program to clone an array list to another array list.


public class Q2 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(100);
	ar.add(800);
	ar.add(600);
	ar.add(300);
	ar.add(700);
	ArrayList ar1=(ArrayList)ar.clone();
	System.out.println(ar1);
	
	
}
}
