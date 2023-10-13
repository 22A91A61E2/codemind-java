import java.util.Scanner;
public class column
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<c;i++)
        {
            int c1=0,c2=0;
            for(int j=0;j<r-1;j++)
            {
                 if(arr[j][i]==arr[j+1][i])
                 {
                     c1+=1;
                     c2+=1;
                 }
                 else if(arr[j][i]<arr[j+1][i])
                 {
                     c1+=1;
                 }
                 else if(arr[j][i]>arr[j+1][i])
                 {
                     c2+=1;
                 }
            }
            if(c1==r-1 || c2==r-1)
            {
                count+=1;
            }
        }
        System.out.print(count);
    }
}