package Exception;

public class Exception_methods_genrate  {
	int a=10;
	int b=0;
	public void A() {
		System.out.println(a/b);
	}
	public void B() {
		this.A();
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Not allow Divisible Zero");
		}
		
	}
	public void C() {
		this.B();	
		System.out.println(a/b);
	
	}
	public void D() {
		this.C();
		System.out.println(a/b);
		
	}
	public static void main(String[] args) {
		Exception_methods_genrate ss=new Exception_methods_genrate();
		ss.D();
	}

}
