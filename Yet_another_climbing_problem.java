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
            if(a%b==0)
            {
                System.out.printf("%d%n",a/b);
            }
            else
            {
                System.out.printf("%d%n",a/b+(a%b));
            }
        }
    }
}