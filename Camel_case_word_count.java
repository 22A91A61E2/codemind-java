import java.util.Scanner;
public class pri
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c=0;
        for(int i=1;i<=s.length()-1;i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                c++;
            }
        }
        System.out.print(c+1);
    }
}