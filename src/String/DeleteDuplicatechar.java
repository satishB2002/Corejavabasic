package String;

import Accessmadifier.publicmodifier;

public class DeleteDuplicatechar {
	public void input() {
		
		
		String Str="aabbbcccddd";
		char v=' ';
		char a[]=Str.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j])
			{
				a[j]=v;
				
			} 
			
		}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=' ') {
			System.out.print(a[i]);
			}
		}
		}
		
	
	public static void main(String[] args) {
		DeleteDuplicatechar ss=new DeleteDuplicatechar();
		ss.input();
	}
		
	

}
