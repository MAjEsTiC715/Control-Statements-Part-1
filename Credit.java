//Documentation
/*Develop a Java application that will determine whether any of several department-store
 *  customers has exceeded the credit limit on a charge account. For each customer, 
 *  the following facts are available:

account number
balance at the beginning of the month
total of all items charged by the customer this month
total of all credits applied to the customer’s account this month
allowed credit limit.

The program should input all of these facts as integers, calculate the new balance 
(= beginning balance + charges – credits), display the new balance and determine 
whether the new balance exceeds the customer’s credit limit. For those customers 
whose credit limit is exceeded, the program should display the message "Credit 
limit exceeded". */
public class Credit {

	private int account; // instance variable
	private int oldBalance; // instance variable
	private int charges; // instance variable
	private int credits; // instance variable
	private int creditLimit; // instance variable
	
	// constructor initializes oldBalance, charges, credits, and creditLimit 
	//with parameter name
	public Credit(int oldBalance, int charges, int credits, int creditLimit)
	{
		this.oldBalance = oldBalance;
		this.charges = charges;
		this.credits = credits;
		this.creditLimit = creditLimit;
	}
	// method to set the oldBalance
	public void setOldBalance(int oldBalance) 
	{
		this.oldBalance = oldBalance;
	}
	// method to set the charges
	public void setCharges(int charges) 
	{
		this.charges = charges;
	}
	// method to set the credits
	public void setCredits(int credits) 
	{
		this.credits = credits;
	}
	// method to set the creditLimit
	public void setCreditLimit(int creditLimit) 
	{
		this.creditLimit = creditLimit;
	}
	// method that calculates the new balance 
	public int getNewBalanceAmount(int oldBalance, int charges, int credits, int creditLimit)
	{
		int newBalance = oldBalance + charges - credits;
		
		return newBalance; // return the solution newBalance
	}
	// method to get the oldBalance
	public int getOldBalance() 
	{
		return oldBalance;
	}
	// method to get the charges
	public int getCharges() 
	{
		return charges;
	}
	// method to get the credits
	public int getCredits() 
	{
		return credits;
	}
	// method to get the creditLimit
	public int getCreditLimit() 
	{
		return creditLimit;
	}

}
