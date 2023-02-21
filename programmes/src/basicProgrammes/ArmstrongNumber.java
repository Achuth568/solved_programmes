package basicProgrammes;
import java.util.Scanner;

public class ArmstrongNumber {
	public static int armstrongNumber(int n){
		int temp=0;
		while(n>0){
			int rem=n%10;
			temp=temp+(rem*rem*rem);
			
			 n=n/10;
		}
		return temp;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(armstrongNumber(n)==n){
			System.out.println("armstrong number");
		}
		else{
			System.out.println("not a armstrong number");
		}

	}

}
