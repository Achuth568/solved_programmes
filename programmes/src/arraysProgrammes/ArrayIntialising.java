package arraysProgrammes;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayIntialising {
	
	public static int[] sortt(int[] arr1){
		
		Arrays.sort(arr1);
		
		
		return arr1;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]={1,2,3,4,5};
		
		int n=sc.nextInt();
		int arr1[]=new int[n];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		// to print using Arrays class
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		//to print using for each
		for(int a: arr1){
			System.out.println(a);
		}
		
	
		
	System.out.println( Arrays.toString(sortt(arr1)));
	
	sc.close();
		
		
		

	}

}
