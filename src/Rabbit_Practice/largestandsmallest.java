package Rabbit_Practice;

import java.util.Arrays;

//1. Write a Java program to find the largest and smallest number in an array of integers.

public class largestandsmallest {
public static void main(String[] args) {
	int a[]= {74,58,96,3,54,28,39,71,45};
	Arrays.sort(a);

	System.out.println("Smallest Ele="+a[0]);
	System.out.println("Largest Ele="+a[a.length-1]);
}
}
