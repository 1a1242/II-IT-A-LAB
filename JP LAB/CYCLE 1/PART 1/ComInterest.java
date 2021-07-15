import java.util.Scanner;
class ComInterest
{
   public static void main(String args[])
   {
     float p, t, r, n;
     double ci;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Principle :");
     p = sc.nextFloat();
     System.out.println("Enter the t in years :");
     t = sc.nextFloat();
     System.out.println("Enter the rate of interest:");
     r = sc.nextFloat();
      System.out.println("Enter the number of times the interest is compounded per year:");
     n = sc.nextFloat();
     sc.close();
     ci = p * Math.pow(1 + (r/n), n*t);
     System.out.println("Compound Interest is  : " + ci);
    }
}
