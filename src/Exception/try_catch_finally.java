package Exception;

public class try_catch_finally {
	
	public static void main(String[] args) {
		int a=10,b=0;
		try {
			System.out.println("Addition="+(a/b));
			System.exit(1);
			} 
		catch (Exception e)
			{
			System.out.println(e);
			e.printStackTrace();
			System.exit(1);
			}
		finally
			{
			System.exit(1);
			System.out.println("Hellow Finally");
			}
		
		System.out.println("Outside the finally");
	}
}
