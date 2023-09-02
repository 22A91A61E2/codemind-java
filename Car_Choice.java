import java.util.Scanner;
public class pri
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            float x1 = sc.nextInt();
            float x2 = sc.nextInt();
            float y1 = sc.nextInt();
            float y2 = sc.nextInt();
            if(y1/x1<y2/x2)
            {
                System.out.println(-1);
            }
            else if(y1/x1>y2/x2)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
            
             
        }
    }
}