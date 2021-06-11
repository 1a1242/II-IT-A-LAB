public class MultipleCatch{  
  
    public static void main(String[] args) {  
          
           try{    
                int a[] = new int[5];    
                a[10] = 100;
		int n = 10/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBound Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("Exceptions Caught....");    
    }  
}