import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
             char x = s.charAt(i);
             if(Character.isDigit(x))
             {
                int b = Integer.parseInt(String.valueOf(x));
                sum=sum+b;
             }
        }
        System.out.print(sum);
    }
}