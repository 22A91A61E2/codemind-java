import java.util.Scanner;
public class multi{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4=(n1*n2*n3*512*2);
        System.out.printf("%d",n4);
        
    }
}