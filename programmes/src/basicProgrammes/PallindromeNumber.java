package basicProgrammes;
import java.util.Scanner;

public class PallindromeNumber {
	public static int pallindrome(int n){
		int temp=0;
		while(n>0){
			int rev=n%10;
			temp=temp*10+rev;
			
			n=n/10;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(pallindrome(n)==n){
			System.out.println("pallindrome number");
		}
		else{
			System.out.println("not a pallindrome number");
		}
	
		

	}

}
