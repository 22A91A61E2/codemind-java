import java.util.Scanner;
public class num
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int C=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            while(a[i]!=0)
            {
                c+=1;
                a[i]/=10;
            }
            if(c%2==0)
            {
                C+=1;
            }
        }
        System.out.printf("%d",C);
    }
}