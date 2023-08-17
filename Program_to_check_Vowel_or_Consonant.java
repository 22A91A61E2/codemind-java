import java.util.Scanner;
public class vow
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            System.out.printf("Vowel");
        }
        else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            System.out.printf("Vowel");
        }
        else
        {
            System.out.printf("Consonant");
        }
    }
}