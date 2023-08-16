import java.util.Scanner;
public class unit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='V' || c=='v')
        {
            System.out.printf("Violet");
        }
        else if(c=='I' || c=='i')
        {
            System.out.printf("Indigo");
        }
        else if(c=='B' || c=='b')
        {
            System.out.printf("Blue");
        }
        else if(c=='G' || c=='g')
        {
            System.out.printf("Green");
        }
        else if(c=='Y' || c=='y')
        {
            System.out.printf("Yellow");
        }
        else if(c=='O' || c=='o')
        {
            System.out.printf("Orange");
        }   
        else if(c=='R'|| c=='r')
        {
            System.out.printf("Red");
        }
        else
        {
            System.out.printf("-1");
        }
    }
}