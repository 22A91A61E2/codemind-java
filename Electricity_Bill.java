import java.util.Scanner;
public class unit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();
        int u = sc.nextInt();
        double U;
        if(u<=199)
        {
            U=u*1.20;
        }
        else if(u>=200 && u<400)
        {
            U=u*1.50;
        }
        else if(u>=400 && u<600)
        {
            U=u*1.80;
        }
        else
        {
            U=u*2.00;
        }
        if(U>400)
        {
            System.out.printf("%.2f",U+(15*U)/100);
        }
        else
        {
            System.out.printf("%.2f",U+100);
        }
    }
}