import java.util.Scanner;
public class code
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c+=1;
                }
            }
            if(c==1)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                     
                }
            }
        }
         
        if(max==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(max);
        }
        
        
    }
}