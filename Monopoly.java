import java.util.Scanner;
public class climb
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b+c)
            {
                System.out.printf("YES%n");
            }
            else if(b>a+c)
            {
                System.out.printf("YES%n");
            }
            else if(c>a+b)
            {
                System.out.printf("YES%n");
            }
            else
            {
                System.out.printf("NO%n");
            }
        }
    }
}