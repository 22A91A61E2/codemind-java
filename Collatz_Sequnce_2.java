import java.util.Scanner;
public class coll
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max=0;
        int y=0;
        for(int i=a;i<=b;i++)
        {
            int x=i;
            int c=0;
            while(x!=1)
            {
                if(x%2==0)
                {
                    x=x/2;
                }
                else
                {
                    x=3*x+1;
                }
                c+=1;
            }
            if(c>max)
            {
                max=c;
                y=i;
            }
        }
        System.out.printf("%d",y);
    }
}