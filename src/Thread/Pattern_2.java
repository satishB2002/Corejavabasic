package Thread;

public class Pattern_2 extends Thread {
	int i,j;
		public void run() {
			for (int i = 0; i <=5; i++) {
				for (int j = 0; j <=5; j++) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					if(i==1||j==1||j==1||j==5)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print("  ");
						}
				}
				System.out.println();
			}
			
			
		}
public static void main(String[] args) {
	Pattern_2 ss=new Pattern_2();
	ss.start();
}
}
