package Constructor;

import java.util.Scanner;

public class Nesting_Method {
	Scanner sc=new Scanner(System.in);
	static int a=10,b=20,add=0;
	double avg,perc;
int  add(int a,int b) {
	
	System.out.println();
	
	
	return (a+b);
}
double avg()
{
  int k=add(a, b);
  avg=k/5;
  System.out.println(avg);
	return  avg;
}
void perc()
{
	int p=(int) avg();
	perc=p*10;
	System.out.println(perc);
	
}
public static void main(String[] args) {
	
	Nesting_Method ss=new Nesting_Method();
	ss.add(a,b);
	ss.avg();
	ss.perc();
	
}

}
