package Exception;

public class Exist_Finally {
public static void main(String[] args) {
	int a=10,b=0;
try {
	System.out.println(a/b);
	//System.exit(1);
} catch (Exception e) {
	System.out.println(e);
	System.exit(9);
}
finally {
	System.out.println("Hello");
}
}
}
