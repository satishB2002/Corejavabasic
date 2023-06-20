package Constructor;
//Write a Java Program to Copy the values from one object to another Object.
public  class One_Object {
	int a;
	String Str;
	 One_Object(int a,String Str){
		
		
	}
	 One_Object(One_Object pp)
	 {
		 this.a=a;
			this.Str=Str;
	 }
	 
	public void disp() {
		
		System.out.println(a);
		System.out.println(Str);
	}
	

	public static void main(String[] args) {
		One_Object ss=new One_Object(10," Satish");
				
		One_Object ss2=new One_Object(ss);
		ss.disp();
		ss2.disp();
	}
}
