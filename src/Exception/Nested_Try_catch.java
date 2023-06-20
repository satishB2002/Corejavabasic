package Exception;

public class Nested_Try_catch {
	public static void main(String[] args) {
		int a=10,b=0;
		
		try {
			System.out.println(a==b);
			try {
				System.out.println(a/b);
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}

}
