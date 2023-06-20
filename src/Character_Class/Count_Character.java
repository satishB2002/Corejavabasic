/*Q6. WAP to count all the character only of given String 

 String s="I love my india 1000 times"*/

package Character_Class;

public class Count_Character {
	public static void main(String[] args) {
		int i,c;
		String Str="Welcome123";
		char[]a=Str.toCharArray();
		c=0;
		for(i=0;i<a.length;i++)
		{
			if(Character.isLetter(a[i]))
				
				c++;
			
		}
		System.out.println("Character Count Is="+c);
		//System.out.println(Character.isLetter(a[i]));
	}

	

}
