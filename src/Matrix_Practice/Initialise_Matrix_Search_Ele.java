package Matrix_Practice;
/*Wap initialise a 3*3 matrix and search any  two 
 * element and print the condition:
    only 1st element found
     only 2nd element found
     both element found
      not any element found*/
public class Initialise_Matrix_Search_Ele {
public void name() {
	int a[][]= {      {9,8,1},
	                  {4,2,5},
         	          {7,6,3}
	            };
	int ele1=1;
	int ele2=9;
	int c=0,k=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i][j]==ele1)
			{
				
			c++;
			}
			if(a[i][j]==ele2)
			{
				
				k++;
			}
			}
	}
	if(c==1 )
	{
		System.out.println(" Only First Element Found");
	}
	
	else if(c==1 && k==1)
	{
		System.out.println(" both element found");
	}
	else if(c==0 && k==0)
	{
		System.out.println("not any element found");
	}
}
public static void main(String[] args) {
	Initialise_Matrix_Search_Ele ss=new Initialise_Matrix_Search_Ele();
	ss.name();
}
}
