package basicProgrammes;
import java.util.Scanner;

public class sumOfDigit {
	
	public static int digitSum(int n){
		int sum=0;
		while(n>0){
			int temp=n%10;
			sum=sum+temp;
			
			
			n=n/10;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(digitSum(n));

	}

}
