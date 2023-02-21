package exceptionhandlingProgrammes;

public class TryCatch {
	
	

	public static void main(String[] args) {
		
		
		try{
			int c=10/10;
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		finally{
			System.out.println("it prints whatever");
		}

	}

}
