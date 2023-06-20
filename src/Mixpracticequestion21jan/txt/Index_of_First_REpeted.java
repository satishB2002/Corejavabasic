package Mixpracticequestion21jan.txt;
/*Q5.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. the element that occurs more than once and whose index of the first occurrence is the smallest. 

Examples: 

Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 */
public class Index_of_First_REpeted {
int i,j;
int a[]= {0, 5, 3, 4, 3, 5, 6};
public void name() {
	int c=0;
	int Count=0,v=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				c++;
			}
		}
		if(Count>c)
		{
			Count =c;
			v=a[i];
			
		}
		for (int j = 0; j <1; j++) {
			System.out.println(v);
		}
		
	}
	
}
public static void main(String[] args) {
	Index_of_First_REpeted  ss=new Index_of_First_REpeted ();
	ss.name();
}
}
