//Ronald Phillips
public class SavingsAccount {
	
private static double annualInterestRate;
private double savingsbalance;

public SavingsAccount(double balance){
	savingsbalance=balance;
}

public static void setInterestRate(double rate){
	annualInterestRate=rate;
}

public double CalculateMonthlyInterest(){
	savingsbalance=savingsbalance+((savingsbalance*annualInterestRate)/12);
	return (savingsbalance*annualInterestRate)/12;
}

public double getBalance(){
	return savingsbalance;
}

}
