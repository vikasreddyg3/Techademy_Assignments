package problem1_Assignment;

public class SavingAccount extends Account_BaseClass
{
	public void calculateIntrest(double balance,double intrest)
	{
		double intrestCalucation=balance*intrest/100;
		balance=balance+intrestCalucation;
		System.out.println("Calculated intrest for present saving Account avaliable balance :"+intrestCalucation);
		System.out.println("Intrest calculated to saving account balance + added intrest to the account :"+balance);
	}

}
