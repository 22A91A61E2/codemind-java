import java.util.Scanner;
import java.util.Arrays;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s ="";
        s=s1+s2;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.print(arr);
    }
}