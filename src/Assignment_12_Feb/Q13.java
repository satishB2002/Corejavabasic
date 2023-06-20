package Assignment_12_Feb;

import java.awt.PageAttributes.OriginType;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import Interface.interface1;

public class Q13 {
public static void main(String[] args) {
	String a ="String is barate ";
	
	String s[]=a.split(" ");
	for (int i = 0; i < s.length; i++) {
		StringBuffer ok=new StringBuffer(s[i]);
		System.out.print(ok.reverse()+" ");
		
	}
   
  
}
}
//a.substring(0, a.length() - 2) + a.charAt(a.length() - 1) + a.charAt(a.length() - 2));