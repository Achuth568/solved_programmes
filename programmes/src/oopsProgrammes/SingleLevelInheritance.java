package oopsProgrammes;

  class A{
	 public static  void a(){
	 
	 System.out.println("a class");
	
}
	 }
  class B extends A{
	 public static void b(){
	 
	System.out.println("b class");
	 
	 }
}
public class SingleLevelInheritance {
	
public static void main(String[] args) {
	
	// we can call them by using object creation
	B bb =new B();
	bb.b();
	bb.a();
	
	// we can call by using class name because they are static methods
	B.b();
	B.a();
	

	}

}
