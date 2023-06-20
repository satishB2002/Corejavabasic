package Thread;

import throw_and_throws.CustomGenrator;
import throw_and_throws.Custom_Exception;

public class Example_Custom_Exception {
	public void disp() {
		int a=17;
		if(a<18)
		{
			throw new CustomGenrator("You are not eligible for voat");
		}else
		{
			System.out.println("Eligible for voat");
		}
	}
	
		public static void main(String[] args) {
			Custom_Exception s=new  Custom_Exception();
			try {
				s.disp();
			} catch (CustomGenrator e) {
				System.out.println(e);
				
			}
		
		}
}