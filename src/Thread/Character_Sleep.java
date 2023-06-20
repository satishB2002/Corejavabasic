package Thread;

public class Character_Sleep extends Thread {

String Str="SATISH BARATE";
int a=45,b=0;
public void run() {
	char []a=Str.toCharArray();
	for (int i = 0;i  < a.length; i++) {
		try {
			
			Thread.sleep(300);
		} catch (Exception e) {
			System.out.println(e);		}
		System.out.print(a[i]+" ");
	}
	
	
}
public static void main(String[] args) {
	Character_Sleep ss=new Character_Sleep();
	ss.start();
}
}
