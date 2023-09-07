import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if((int)arr[i]>max)
            {
                max=(int)arr[i];
            }
        }
        System.out.print((char)max);
    }
}