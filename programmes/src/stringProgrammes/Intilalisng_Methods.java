package stringProgrammes;
import java.util.Scanner;

public class Intilalisng_Methods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string1 =new String("achuth solo");
		String string2="jagath";
		String string3=sc.next();
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		
		//length of a string
		
		System.out.println(string1.length());
		
		
		//convert to Lowercase
		
		System.out.println(string1.toLowerCase());
		
		
		//convert to uppercase
		
		System.out.println(string1.toUpperCase());
		
		
		// to concatenate two strings
		
		System.out.println(string1+string2);
		
		System.out.println(string3.concat(string3));
		
		//to comapre teo strings equal or not
		
		System.out.println(string1==string2);
		System.out.println(string1.equals(string2));
		
		//knowing the character by using a index in a string
		
		System.out.println(string1.charAt(1));
		
		
		
		// converting string into a character array
		
		char ch[]=string1.toCharArray();
		for(char c:ch){
			System.out.println(c);
		}
		
		
		
		
		//string contains a given  string word or not
		
		System.out.println(string1.contains("achuth"));
		
		
		//replace a string or character in a string
		
		System.out.println(string1.replace('a', 'c'));
		System.out.println(string1.replace("achuth","atchuth"));
		
		
		//convert string into string array using split
		
		String str[] =string1.split(" ");
		for(String s:str){
			System.out.println(s);
		}
		
		String st[]=string1.split("achuth", 1);
		for(String ss:st){
			System.out.println(ss);
		}
		
		

	}

}
