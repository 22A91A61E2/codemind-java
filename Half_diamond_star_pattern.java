import java.util.Scanner;
public class dia
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=3 && n<=100)
        {
            for(int i=1;i<=n;i++)
            {
               for(int j=1;j<=i;j++)
                {
                   System.out.printf("*");
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--)
            {
                for(int k=1;k<=i;k++)
                {
                   System.out.printf("*");
                } 
                System.out.println();
            }
        }
        else
        {
            System.out.printf("The pattern is not possible");
        }
    }
}