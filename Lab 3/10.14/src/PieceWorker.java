
public class PieceWorker extends Employee {

	private double wage;
	private double piece;
	
	public PieceWorker(String firstName, String lastName,
      String socialSecurityNumber, double wage, int piece){
		
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");

	      if (piece < 0.0) // validate piece
	         throw new IllegalArgumentException(
	            "Pieces must be greater than 0");

	      this.wage = wage;
	      this.piece = piece;
	}
	
	public void setWage(double wage){
		if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");

	      this.wage = wage;
	}
	
	public void setPiece(double piece){
		if (piece < 0.0) // validate piece
	         throw new IllegalArgumentException(
	            "Pieces must be >= 0.0");

	      this.piece = piece;
	}
	
	public double getWage(){
		return wage;
	}
	
	public double getPiece(){
		return piece;
	}
	
	public double earnings()                                            
	   {                                                                   
		return piece*wage;
	   }                                          

	   // return String representation of HourlyEmployee object              
	   @Override                                                             
	   public String toString()                                              
	   {                                                                     
	      return String.format("piece employee: %s%n%s: $%,.2f; %s: %,.2f",
	         super.toString(), "per piece wage", getWage(),                     
	         "pieces", getPiece());                                   
	   }                                 
}
