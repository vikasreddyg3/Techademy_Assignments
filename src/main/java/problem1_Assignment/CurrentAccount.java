package problem1_Assignment;

public class CurrentAccount extends Account_BaseClass
{
	public void calculateIntrest(double balance,double intrest)
	{
		double intrestCalucation=balance*intrest/100;
		balance=balance+intrestCalucation;
		System.out.println("Calculated intrest for present Current Account avaliable balance :"+intrestCalucation);
		System.out.println("Intrest calculated to Current account balance + added intrest to the account :"+balance);
	}


}
