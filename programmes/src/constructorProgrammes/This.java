package constructorProgrammes;

public class This {
	
    static int a;
	String name;
	boolean flag;
	
	This(int a,String name,boolean flag){
		this.a=a;
		this.name=name;
		this.flag=flag;
		
		System.out.println(a+" "+name+" "+flag);
	}
	
	public static void print(){
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		This t = new This(357,"achuth",true);
		print();

	}

}
