//Ronald Phillips
public class ExceptionC extends ExceptionB{



	public ExceptionC(String type, String detail){
		super(type,detail);
	}


	public static void ThrowExceptionC() throws ExceptionC{


		throw new ExceptionC("ExceptionC","Exception in ExceptionC.java");

	}
}
