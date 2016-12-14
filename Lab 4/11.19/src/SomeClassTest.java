//Ronald Phillips
public class SomeClassTest {

	public static void main(String[] args) {
		try{
			System.out.println("Creating faulty constructor");
			SomeClass someClass=new SomeClass(4,0);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
	}

}
