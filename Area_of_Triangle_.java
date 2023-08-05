import java.util.Scanner;
public class multi{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double n1= sc.nextInt();
        double n2= sc.nextInt();
        double n3=  sc.nextInt();
        double s=(n1+n2+n3)/2;
        double n4=Math.sqrt(s*(s-n1)*(s-n2)*(s-n3));
        System.out.printf("%.2f",n4);
    }
}