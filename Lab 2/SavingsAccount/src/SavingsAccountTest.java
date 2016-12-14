//Ronald Phillips
public class SavingsAccountTest {

	public static void main(String[] args) {

		System.out.println("Creating Account 1 with balance of $2000...");
		System.out.println("Creating Account 2 with balance of $3000...");
		
		SavingsAccount account1=new SavingsAccount(2000);
		SavingsAccount account2=new SavingsAccount(3000);
		int month=1;
		
		System.out.println("Setting Interest to 4%");
		
for(int i=1; i<13; i++){
		SavingsAccount.setInterestRate(.04);
		System.out.println("Month "+month);
		System.out.println("Calculating monthly interest...");
		System.out.println("Account 1 interest this month: "+account1.CalculateMonthlyInterest());
		System.out.println("Account 2 interest this month: "+account2.CalculateMonthlyInterest());
		System.out.println("Calculating end of month balance for both accounts");
		System.out.println("Account 1 end of month balance: "+account1.getBalance());
		System.out.println("Account 2 end of month balance: "+account2.getBalance());
		month++;
}
//end loop
		
		System.out.println("Setting Interest to 5%");
		SavingsAccount.setInterestRate(.05);
		System.out.println("Month 1 at new Interest");
		System.out.println("Calculating monthly interest...");
		System.out.println("Account 1 interest this month: "+account1.CalculateMonthlyInterest());
		System.out.println("Account 2 interest this month: "+account2.CalculateMonthlyInterest());
		System.out.println("Calculating end of month balance for both accounts");
		System.out.println("Account 1 end of month balance: "+account1.getBalance());
		System.out.println("Account 2 end of month balance: "+account2.getBalance());

	}

}
