//Ronald Phillips
public class MethodTest extends Exception{

	public static void main(String[] args) {
		try{
			SomeMethod();
		}
		catch(Exception exception){
			exception.printStackTrace();
		}


	}

	public static void SomeMethod() throws Exception{
		try{
			SomeMethod2();
		}
		catch(Exception exception){
			throw new Exception(exception);
		}
	}

	public static void SomeMethod2() throws Exception{
		throw new Exception("Exception thrown in SomeMethod2");
	}

}
