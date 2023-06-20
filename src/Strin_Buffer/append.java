package Strin_Buffer;
import java.util.*;
public class append {
	public static void main(String[] args) {
		String s="Codenera";
		StringBuffer ab=new StringBuffer();
		ab.append("In Pune ");
		StringBuffer ab1=new StringBuffer("In Codenera");
		ab.append(ab1.toString());
		System.out.println(" String  ="+s);
		System.out.println("AB 1 "+ab);
		System.out.println("AB 2 "+ab1);
	}

}
