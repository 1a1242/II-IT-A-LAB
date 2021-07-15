import java.util.Scanner;
class LeapYear{
      public static void main(String args[]){
             int a ;
             Scanner obj = new Scanner(System.in);
             System.out.println("Type a num:");
             a = obj.nextInt();
             obj.close();
             if(a%4 == 0){
                 System.out.println(a+ " year is leap year");
             }
             else{
                 System.out.println(a+ " year is not a leap year");
             }
      }
}
