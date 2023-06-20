package Arraydifficult;

import java.util.Scanner;

import Interface.interface1;
import parameterass.arrayevenposition;

public class return_Array {
	Scanner sc =new Scanner(System.in);
	public  int[] name(int	k) {
		int	arr[]=new int[k];
		System.out.println("Enter Your Array");
		for (int i = 0; i < arr.length; i++) {
			arr [i]=sc.nextInt();
		}
		return arr;
	}
public static void main(String[] args) {
	return_Array sd = new return_Array();
	int i[]=sd.name(6);
	int t=0;
	for (int j = 0; j < i.length; j++) {
		
		for (int j2 = j+1; j2 < i.length; j2++) {
			if (i[j]>i[j2]) {
				t=i[j];
				i[j]=i[j2];
				i[j2]=t;	
			}
		}
	}
		for (int j2 = 0; j2 < i.length; j2++) {
			System.out.println(i[j2]);
	}
}
}
