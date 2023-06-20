package Array_Big_Assignment;

public class Quetion_25 {
	int i,j;
	int a[]= {26, 11, 67, 45, 22, 78,54, 34};
	int t=0;
	public void accen() {
		for ( i = 0; i < a.length; i++) {
			for (j =i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
				
			}
		}
		
			System.out.println("Max Ele Is="+a[a.length-1]);
		
	
	}
	public static void main(String[] args) {
		Quetion_25 ss=new Quetion_25();
		ss.accen();
	}
}
