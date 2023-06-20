package Abstract;

import String.intern_method;

public class Ex_propo {
byte a=12;
public void m1() {
	
	try {
		System.out.println(a/0);
	} catch (Exception e) {
		System.out.println(e);
	}
}
public void m2() {
	this.m1();
}
public void m3() {
	this.m2();
}
public static void main(String[] args) {
	Ex_propo ss	=new Ex_propo();
	ss.m3();
	
}
}
