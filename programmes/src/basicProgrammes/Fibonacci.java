package basicProgrammes;
import java.util.Scanner;

public class Fibonacci {
	public static void fibonacci(int n,int a,int b){
		
		if(n==0){
			System.out.println(-1);
		}
		else if(n==1){
			System.out.println(0);
		}
		else if(n==2){
			System.out.println(2);
		}
		else{
			System.out.print(a+" "+b+" ");
			for(int i=0;i<n-2;i++){
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a=0;
		int b=1;
		fibonacci(n,a,b);
		

	}

}
