package Encapsulation;


class Access
{
			private	int empid;
					public void setEmpid(int eid)
					{
						empid=eid;

					}
					public int getEmpid()
					{
					
						return empid;
					}
class Subclass
{
		public static void main(String arg[])
		{
		 Access ss=new  Access();
			ss.setEmpid(101);
		System.out.println(ss.getEmpid());
		
		}

		}

}