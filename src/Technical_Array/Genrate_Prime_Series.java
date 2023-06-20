package Technical_Array;
//Q7.JAVA program to generate prime numbers upto n

public class Genrate_Prime_Series {
public static void main(String[] args) {
		int k=1;
		int n=100;
		int h;
		for (int i = k; i <=n; i++) {
			h=0;
			for (int j =2; j <i-1; j++) {
			if(i%j==0)
				h=k+1;
				
				
			}
			if(h==0)
			{
				System.out.println(i);
			}
				
		}
	
}
}
