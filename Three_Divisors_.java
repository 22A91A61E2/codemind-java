import java.util.*;

public class three {
	static void divisors(int N)
	{
	    int c=0;
        for (int i = 2; i * i <= N; i++)
        {
            if (isPrime(i)) 
            {
				if (i * i <= N) 
				{
				    c+=1;
				}
			}
		}
		System.out.printf("%d",c);
	}
	public static boolean isPrime(int N)
	{
		for (int i = 2; i * i <= N; i++) 
		{
			if (N % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		divisors(N);
	}
}

