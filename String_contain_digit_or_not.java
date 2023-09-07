import java.util.Scanner;
import java.util.Arrays;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr=s.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if((int)arr[i]>=48 && (int)arr[i]<=57)
            {
                c+=1;
            }
        }
        if(c>0)
        {
            System.out.printf("Contains %d digit",c);
        }
        else
        {
            System.out.printf("Doesn't contain digit");
        }
         
    }
}