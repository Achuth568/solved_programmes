package basicProgrammes;
import java.util.Scanner;


public class Factorial {
	public static int factorial(int n){
		int pdt=1;
		for(int i=n;i>=1;i--){
			pdt=pdt*i;
			
		}
		return pdt;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(factorial(n));

	}

}
