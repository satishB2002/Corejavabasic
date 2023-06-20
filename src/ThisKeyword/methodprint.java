package ThisKeyword;

public class methodprint {
		int id;
		String name;
		public void input(int id,String name)
		{
			this.id=id;
			this.name=name;
			System.out.println(id+" "+name);
		}
		public static void main(String arg[])
		{
			
			methodprint sc=new methodprint();
			sc.input(121,"satish");
			
		}
}
