import java.util.Scanner;
public class oct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++)
        {
            String a = sc.next();
            int z = Integer.parseInt(a,2);
            System.out.println(Integer.toString(z,8));
        }
    }
}