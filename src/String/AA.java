package String;

public class AA {
public static void main(String[] args) {
	String s	="0101015021A03S640%";
	char a[]=s.toCharArray();
	int k=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]<a[j]&&a[i]>0) {
				k=a[i];
				a[i]=a[j];
				a[j]=(char) k;
			} 
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
}
