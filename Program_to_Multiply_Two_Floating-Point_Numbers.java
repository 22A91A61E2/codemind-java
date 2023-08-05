import java.util.Scanner;
public class multi{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float number1= sc.nextFloat();
        float number2= sc.nextFloat();
        double number3=number1*number2;
        System.out.printf("%.2f",number3);
        
    }
}