package Exception;

import throw_and_throws.throw_1;

public class Exp_Custom {
	public void input()
	{
		int	n=150;
		int k=150;
		if (n==k) {
			throw new Cust_Exp("N And K is Equal");
		}else 
			{
				System.out.println("N and K is Not Equal");
			}
		
	}
public static void main(String[] args) {
	 Exp_Custom ss	=new  Exp_Custom();
	 try {
		ss.input();
	} catch (Cust_Exp e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
