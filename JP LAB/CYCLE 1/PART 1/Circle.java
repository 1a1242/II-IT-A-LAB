import java.util.Scanner;
class Circle{
     public static void main(String args[]){
     double r, a, c;
     Scanner obj = new Scanner(System.in);
      System.out.println("Enter the radius of the circle: ");
     r = obj.nextDouble();
     a = 3.14*r*r;
     c = 2*3.14*r;
     System.out.println("Area of a circle is "+a);
       System.out.println("Circumference of a circle is "+ c);
      }
}
