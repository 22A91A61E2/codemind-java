import java.util.Scanner;
public class can
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double s = Math.abs(a-b);
            if(s>=a || a==b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
     
}