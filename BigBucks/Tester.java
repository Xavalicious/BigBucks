import java.util.ArrayList;
import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
		boolean fact=true;
		int a=0;
		String name="";
		
		while(fact==true)
		{
		Scanner objTake=new Scanner(System.in);
		System.out.println("Enter bank account name here (\"Exit to abort\"):");
		name=objTake.next();	
		if(name.toUpperCase().equals("EXIT"))
		{break;}	
		//Scanner objTake1=new Scanner(System.in);	
		System.out.println("Enter bank account balance here:");
		double balance=objTake.nextDouble();
		BankAccount setter=new BankAccount(name,balance);
		accounts.add(a,setter);
		a++;
		}
		
		double highest=0;
		double highest1=0;
		int c=0;
		for(int b=0;b<accounts.size();b++)
		{
		highest=accounts.get(b).returnBalance();
		if(highest>highest1)
		{
		highest1=highest;
		c=b;
		}
		}
		
		System.out.println("The account with the largest balance belongs to "+accounts.get(c).returnName()+".");
		System.out.println("The amount is "+accounts.get(c).returnBalance()+".");
	}

}
