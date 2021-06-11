class CustomException extends Exception
{
   String msg;
   CustomException(String str)
   {
      msg = str;
   }
   public String toString()
   {
      return ("Custom exception occurred - " + msg);
   }
}
public class CustomExceptions
{
   public static void main(String args[]) 
   {
      try 
      {
         throw new CustomException("Custom Message....");
      } 
      catch(CustomException e)
      {
         System.out.println(e);
      }
   }
}