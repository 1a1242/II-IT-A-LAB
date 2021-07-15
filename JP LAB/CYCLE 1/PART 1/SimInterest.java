import java.util.Scanner;
class SimInterest
{
   public static void main(String args[])
   {
     float p, t, r, si;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Principle :");
     p = sc.nextFloat();
     System.out.println("Enter the t in years :");
     t = sc.nextFloat();
     System.out.println("Enter the rate of interest:");
     r = sc.nextFloat();
     sc.close();
     si = (p*t*r) / 100;
     System.out.println("Simple Interest is  : " + si);
    }
}
