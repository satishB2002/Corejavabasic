package Thread;
class Table
{
	int i,j;
	int n1=4;
	int n2=6;
	public void input(int n1 ,int n2) {
		
		{int i,j;
		System.out.println("Table for 4");
		for(i=1;i<=10;i++)
		{
									
					for(j=1;j<=n1;j++)
					{
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					System.out.print(i*j+"  ");
	                               }
			System.out.println();
	}
		}
		System.out.println("Table for 6");
		for(i=1;i<=10;i++)
		{
			
			for(j=1;j<=n2;j++)
			{
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.print(i*j+"  ");
			}
			System.out.println();
		}
	}
	}

	

public class Synchronised_Block extends Thread{
	static Table st;
int n1,n2;

	
	public void run() {
			
			st.input(n1,n2);	
	}
	public static void main(String[] args) {
		st =new Table ();
		Synchronised_Block ss=new Synchronised_Block ();
		ss.n1=4;
		ss.n2=6;
		ss.start();
	}
	

}
