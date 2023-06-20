package Strin_Buffer;

public class StringBufferClass {
	
	    
		  //StringBuffer  ab ;  
		    
		     //    01234567
		              // String s="Codenera";
		  
		     public String getString_FromStringBuffer( StringBuffer  ab )
		    {
		                 
		                      ab.insert(2, "Pune");
		                      System.out.println("Original String"+ab);
		                      
		              return ab.toString();
		      
		      
		  }
		    

		      public static void main( String gfdj[])
		      {
		                String s="Satish";
		               System.out.println(s);
		           //   System.out.println(s.trim());
		                 
		             StringBufferClass  ab= new StringBufferClass();
		               System.out.println("String is "+ab.getString_FromStringBuffer(new StringBuffer("Codenera")));
		                      
		                
		           
		      }
		          
		      



		    
		}
