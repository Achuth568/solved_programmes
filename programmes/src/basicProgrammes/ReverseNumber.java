package basicProgrammes;
import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int n){
		int rev=0;
		while(n>0){
			
			int temp=n%10;
			rev=rev*10+temp;
			
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(reverse(n));

	}

}
