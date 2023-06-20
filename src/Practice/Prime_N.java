package Practice;
import java.util.*;

public class Prime_N {
public static void main(String[] args) {
	int	n=5;
	int c;
	int	i,j,k;
	for (i = 1; i <=100; i++) {
		c=0;
		k=0;
		for ( j = 1; j <=i; j++) {
			if (i%j==0) 
				c++;
				k++;
			}
			if (c==2) {
			System.out.println(i+" ");
			if (k==n) 
			break;
				
			}
			
			
		}
	}

}
