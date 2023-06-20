package Practice;

public class nested_class {
  static class demo1
{
  int a=10;

	public void demo() {
		
		System.out.println(" a="+a);
	}
}
public static void main(String[] args) {
	nested_class.demo1 ss=new nested_class.demo1();
	ss.demo();
	
}
}
