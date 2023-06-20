package Encapsulation;

public class disp {
	

	public static void main(String arg[])
	{
		employee ss=new employee();
		ss.setId(21);
		ss.setName("satish");
		ss.setSal(25000);
		
		
		System.out.println("Id="+ss.getId());
		System.out.println("Name="+ss.getName());
		System.out.println("Salary="+ss.getSal());
	}

	private static String getSal() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
