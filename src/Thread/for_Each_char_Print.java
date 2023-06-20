package Thread;

public class for_Each_char_Print extends Thread{
String Str="Satish";

	public void run() {
		char a[]=Str.toCharArray();
		for (char c : a) {
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(c);
		}
		
	}
public static void main(String[] args) {
	for_Each_char_Print ss=new for_Each_char_Print();
	ss.start();
}
}
