import java.util.Scanner;
public class Sample{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double number1=sc.nextInt();
        double number2=sc.nextInt();
        double number3=(number1+number2)/2;
        System.out.printf("%.4f",number3);
        
    }
}