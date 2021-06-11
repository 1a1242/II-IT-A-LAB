class NestedTryCatch
{  
	public static void main(String args[])
	{  
	try
	{
		try
		{
			System.out.println("Creating Arthematic Exception");  
			int n = 10/0;  
		}
		catch(ArithmeticException e)
    		{
     			System.out.println(e);
    		}  
    		try
    		{
    			System.out.println("Creating ArrayIndexOutOfBounds Exception");
    			int a[] = new int[5];  
    			a[10] = 10 ;  
    		}
    		catch(ArrayIndexOutOfBoundsException e)
    		{
      			System.out.println(e);
    		}   
  	}
  	catch(Exception e)
  	{
    		System.out.println("Exceptions Caught....");
  	}    
 	}  
}