import java.util.Scanner;
public class pri
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                x+=1;
            }
        }
        if(x==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(x);
        }
        
    }
}