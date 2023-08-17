import java.util.Scanner;
public class drop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>50)
        {
            if(b>60 && c>100)
            {
                System.out.printf("10");
            }
            else if(b>60 && c<=100)
            {
                System.out.printf("9");
            }
            else if(b<=60 && c>100)
            {
                System.out.printf("7");
            }
            else
            {
                System.out.printf("6");
            }
        }
        else if(b>60)
        {
            if(c>100)
            {
                System.out.printf("8");
            }
            else
            {
                System.out.printf("6");
            }
        }
        else if(c>100)
        {
            System.out.printf("6");
        }
        else
        {
            System.out.printf("5");
        }
             
    }
}