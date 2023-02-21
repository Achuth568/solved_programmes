package basicProgrammes;
import java.util.Scanner;

public class EvenOdd {
	public static boolean evenOdd(int a){
		
		boolean flag=false;
		
		 if(a%2==0 ){
			 flag=true;
			return flag;	 
		 }
		 
		 return flag;
		 
		}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		sc.close();
		
		if(evenOdd(a)==true){
			
			System.out.println("even number");
		}
		
		else{
			
			System.out.println("odd number");
			
		}
	}
}
