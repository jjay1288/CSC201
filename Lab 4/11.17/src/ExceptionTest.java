//Ronald Phillips
import java.io.IOException;

public class ExceptionTest{


	public static void main(String[] args) throws Exception{
		int counter =0;

		while (counter<4){
			System.out.print("\n\n");
			try{
				switch (counter){
				case 0: 
					counter = counter+1;
					System.out.println("Throwing Exception in ExceptionA");
					ExceptionA.ThrowExceptionA();

				case 1:
					counter = counter+1;
					System.out.println("Throwing Exception in ExceptionB, using class ExceptionA");
					ExceptionA.ThrowExceptionB();
				case 2:
					counter = counter+1;
					System.out.println("Throwing NullPointerException");
					throw new NullPointerException("NullPointerException");

				case 3:
					counter = counter+1;
					System.out.println("Throwing IOException");
					throw new IOException("IOException");
				}

			}catch (Exception exception){
				exception.printStackTrace();


				StackTraceElement[] traceElements = exception.getStackTrace();

				System.out.printf("%nStack trace:%n");
				System.out.println("Class\t\tFile\t\tLine\tMethod");

				for(StackTraceElement element : traceElements)
				{
					System.out.printf("%s\t", element.getClassName());
					System.out.printf("%s\t", element.getFileName());
					System.out.printf("%s\t", element.getLineNumber());
					System.out.printf("%s%n", element.getMethodName());
				}
			}
		}
	}
}



