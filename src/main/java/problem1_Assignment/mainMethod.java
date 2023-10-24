package problem1_Assignment;

public class mainMethod {

	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount();
		CurrentAccount ca=new CurrentAccount();
		
		sa.calculateIntrest(3325.0, 2.0);
		ca.calculateIntrest(49.0, 3.0);

	}

}
