import java.util.Scanner;
public class car
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x  = sc.nextInt();
        if(n1>n2)
        {
            System.out.printf("-1");
        }
        else
        {
            System.out.printf("%d",(n1+n2+x)/n2);
        }
        
    }
}