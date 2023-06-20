//Q18.Wap enter an array and sort that in accending order.

package Array_Big_Assignment;

public class Quetion_18 {
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
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	
	}
	public static void main(String[] args) {
		Quetion_18 ss=new Quetion_18();
		ss.accen();
	}

}
