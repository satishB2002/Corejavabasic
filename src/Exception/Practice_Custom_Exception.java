package Exception;

public class Practice_Custom_Exception {
	public void input() {
		int a=100;
		int b=500;
		if (a<=b) {
			throw new devil("A is Always Gretor THan B");
			
		} else {
			System.out.println("A is greator ");

		}
		
	}
public static void main(String[] args) {
	Practice_Custom_Exception ss=new Practice_Custom_Exception();
	
	try {
		ss.input();
		
	} catch (devil e) {
		System.out.println(e);
	}
}
}
