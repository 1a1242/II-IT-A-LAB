public class TryCatch{  
  
    public static void main(String[] args) {  
        int i=10;  
        int j=0;  
        int n;  
        try  
        {  
        n =i/j;  
        }   
        catch(Exception e)  
        {    
            System.out.println("Exception araised...Resolved the Exception :" + i/(j+1));  
        }  
    }  
}