package basicProgrammes;
import java.util.Scanner;

public class PrimeNumber {
	public static int primeNumber(int n){
		int count=0;
				for(int i=1;i<=n;i++){
					if(n%i==0){
						count++;
					}
				}
				return count;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(primeNumber(n)==2){
			System.out.println("prime number");
		}
		else{
			System.out.println("not a prime number");
		}

	}

}
