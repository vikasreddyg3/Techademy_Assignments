package problem1_Assignment;

public class Account_BaseClass 
{
	
	/*Implement below Program using Java OOPs concepts – Create below three classes and corresponding variables and methods

	Account (Base Class) – Include Interest as one variable and corresponding method to calculate Interest and add to the Account

	SavingsAccount (Derived Class) – Implement overridden methods of Account Class

	CurrentAccount (Derived Class) – Implement overridden methods of Account Class*/
	
	//Calculate interest Method
	public void calculateIntrest(double balance,double intrest)
	{
		double intrestCalucation=balance*intrest/100;
		balance=balance+intrestCalucation;
		System.out.println("Calculated intrest for present avaliable balance :"+intrestCalucation);
		System.out.println("Intrest + balance amount ="+balance);
	}
	
	
	

}
