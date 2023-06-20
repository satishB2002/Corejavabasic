package Exception;

public class Custom_Exception {
public void input() {
	int a=25;
	int b=100;
	if(a<=b)
	{
		throw new Satish_b("A is Always Smaller than B");
		
	}
	else
	{
		System.out.println("A is Greator");
	}
}
public static void main(String[] args) {
	Custom_Exception ss=new Custom_Exception();
	try {
		ss.input();
	} catch (Satish_b e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
