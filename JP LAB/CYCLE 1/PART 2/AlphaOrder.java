import java.util.Scanner;
public class AlphaOrder
{
    public static void main(String[] args) 
    {
        int n;
        String t;
        Scanner s = new Scanner(System.in);
        System.out.print("No of strings:");
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the strings:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i=0; i<n; i++) 
        {
            for (int j = i+1; j<n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    t = names[i];
                    names[i] = names[j];
                    names[j] = t;
                }
            }
        }
        System.out.print("Strings in Alphabetical Order:");
        for (int i=0; i < n-1; i++) 
        {
            System.out.print(names[i] + ",");
        }
        System.out.print(names[n-1]);
    }
}
