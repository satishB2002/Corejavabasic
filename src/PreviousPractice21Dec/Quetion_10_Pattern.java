/*Q11. Write a program to print the following triangle?
1  1  1  1  1
2  2  2  2
3  3  3
4  4
5*/
package PreviousPractice21Dec;

public class Quetion_10_Pattern {
	int i,j;
	 Quetion_10_Pattern()
	 {
		 for(i=1;i<=5;i++)
		 {
			 for(j=i;j<=5;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
	 public static void main(String arg[])
	 {
		 Quetion_10_Pattern ss=new  Quetion_10_Pattern();
	 }
}
