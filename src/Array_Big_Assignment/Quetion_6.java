package Array_Big_Assignment;

public class Quetion_6 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9};
	int c=0;
	public void even_pos() {
		for (i = 0; i < a.length; i=i+2) 
		{
			
			System.out.println(a[i]+" ");
			c++;
			
		}
		
        System.out.println("Count Of Even pos ="+c);
		
	}
	public static void main(String[] args) {
		Quetion_6 ss=new Quetion_6 ();
		ss.even_pos();
	}
}
