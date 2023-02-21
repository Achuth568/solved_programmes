package constructorProgrammes;

public class ConstructorCreation {
	
	int a;
	String name;
	
	ConstructorCreation(){
		 a=100;
		 System.out.println(a);
		
	}
	
	ConstructorCreation(int a,String name){
		
		System.out.println(a+" "+name);
		
	}

	public static void main(String[] args) {
		
	    ConstructorCreation c=new ConstructorCreation();
		ConstructorCreation c1 =new ConstructorCreation(100,"achuth");
		
	
		
		
		
		

	}

}
