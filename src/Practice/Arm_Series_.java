package Practice;

public class Arm_Series_ {
	public void input() {
		for (int i = 1; i <=2000; i++) {
			int rem,res=0,num1=i,temp=i,num=i,n=0;
			while (num!=0) {
				num=num/10;
				n++;
				
			}
			while (num1!=0) {
				rem=num1%10;
				res=res+(int)Math.pow(rem, n);
				num1=num1/10;	
			}
			if (res==temp) {
				System.out.println(res);
			} 
			
		}
		
	}
public static void main(String[] args) {
	Arm_Series_ ss=new Arm_Series_();
	ss.input();
}
}
