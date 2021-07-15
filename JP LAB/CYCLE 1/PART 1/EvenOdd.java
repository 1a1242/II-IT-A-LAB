import java.util.Scanner;
class EvenOdd{
      public static void main(String args[]){
             int a ;
             Scanner obj = new Scanner(System.in);
             System.out.println("Type a num:");
             a = obj.nextInt();
             obj.close();
             if(a % 2 != 0){
                 System.out.println(a+ " is Odd number");
             }
             else{
                 System.out.println(a+ " is a Even Number");
             }
      }
}
