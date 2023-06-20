package Thread;

public class Even_Index_Pos extends Thread{
String Str="Satish";
	public void run() {
		char []a=Str.toCharArray();
		for (int  i= 0; i <a.length; i++) {
			for (char c : a) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
				if(a[i]%2!=0)
				{
					a[i]='*';
					System.out.print(a[i]+" ");
				}
				else
					System.out.print(a[i]+" ");
				
				
			
			
			
		}
	}
	public static void main(String[] args) {
		Even_Index_Pos ss=new Even_Index_Pos();
		ss.start();
	}
}

