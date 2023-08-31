import java.util.Arrays;
import java.util.Scanner;
public class move
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
        int mc=0;
        int ind=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count+=1;
                }
            }
            if(count>mc)
            {
                mc=count;
                ind=i;
            }
        }
        if(mc>n/2)
        {
            System.out.printf("%d",a[ind]);
        }
    }
}