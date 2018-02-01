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
import java.util.ArrayList; // import the library ArrayList
import java.util.List; // import the library List
import java.util.Scanner; // import the library Scanner

public class CreditTest {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in ); // initialize a new scanner
		
		int start; // set up a sentinel
		
		System.out.print("Enter Account Number (or -1 to quit)");
		start = input.nextInt();
		
		List<Credit> users = new ArrayList<Credit>(); // create a list associated with the class Credit
		// set a while loop that keeps the user in the program until he/she enters -1
		while (start != -1)
		{
			System.out.print("Enter Balance: "); // user enters a balance
			int oldBalance = input.nextInt(); // assign int entered to oldBalance
			
			System.out.print("Enter Charges: "); // user enters a Charges
			int charges = input.nextInt(); // assign int entered to Charges
			
			System.out.print("Enter Credits: "); // user enters a Credits
			int credits = input.nextInt(); // assign int entered to Credits
			
			System.out.print("Enter Credit Limit: "); // user enters a Credit Limit
			int creditLimit = input.nextInt(); // assign int entered to creditLimit
			
			// create an object called newUser
			Credit newUser = new Credit(oldBalance, charges, credits, creditLimit);
			users.add(newUser); // add the object to the list users
			newUser.setOldBalance(oldBalance); // set the old balance
			newUser.setCharges(charges); // set the charges
			newUser.setCredits(credits); // set the credits
			newUser.setCreditLimit(creditLimit); // set the creditLimit
			
			// get and print the New Balance Amount from the Credit class
			System.out.printf("%d\n", newUser.getNewBalanceAmount(newUser.getOldBalance(), 
					newUser.getCharges(), newUser.getCredits(), newUser.getCreditLimit()));
			
			// if statements declares if the new balance is > credit limit then print the following statement
			if (newUser.getNewBalanceAmount(oldBalance, charges, credits, creditLimit) > newUser.getCreditLimit())
			{
				System.out.println("Credit limit exceeded");
			}
			
			// ask user to continue or quit (sentinel)
			System.out.println("Enter Account Number (or -1 to quit)");
			start = input.nextInt();
		}
	}
} // end
