package Strin_Buffer;

public class Two_object_append {
	public void input()
	{
		
	}
	public static void main(String[] args) {
		StringBuffer ss=new StringBuffer("Satish");
		StringBuffer ss1=new StringBuffer("barate");
		StringBuffer ss2=new StringBuffer("in");
		StringBuffer ss3=new StringBuffer("Pune");
		ss.append(" "+ss1.append(" "+ss2.append(ss3)));
		ss3.insert(0,"In Codenera ");
		System.out.println(ss);
		System.out.println("Comp name=="+ss3);
	}
}
