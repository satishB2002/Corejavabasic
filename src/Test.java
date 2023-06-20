import MixArraypattern_20_22.This_Keyword;

class A
{
	public void name() {
		System.out.println("m1");
	}
}
class b extends A
{
	
	public void name1() {
		this.name();
		System.out.println("m3");
	}
}
public class Test extends b 
{
	
	public void name2() {
		this.name();
		System.out.println("m5");
	}
     public static void main(String[] args) {
		Test te = new Test();
		te.name2();
	}
}
