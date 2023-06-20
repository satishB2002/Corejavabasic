package throw_and_throws;

public class ThrowsGenrator {
	public static void main(String[] args) {
		Throws_Example  ob=new Throws_Example ();
		 
		try {
			ob.fileopen();
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		try {
			
			ob.filesave();
			System.out.println("File Found");
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("File Not Found");
		}
		
	}

	

}
