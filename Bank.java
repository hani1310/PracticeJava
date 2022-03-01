
public class Bank 
{
	private String string;
	private int age;
	private double balance;
	
	public Bank()
	{
		string = "hani";
		age = 24;
		balance = 1000;		
	}
	public Bank(String s,int a,double b)
	{
		string = s;
		age = a;
		balance = b;				
	}
	public void setString(String s)
	{
		string = s;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	public void set(String s,int a,double b)
	{
		string = s;
		age = a;
		balance = b;	
	}
	public String getString()
	{
		return string;
	}
	public int getAge()
	{
		return age;		
	}
	public double getBalance()
	{
		return balance;
	}
	public double getCredit()
	{
		double credit = 150;
		return balance = balance + credit;
	}
	public double getDebit()
	{
		double debit = 100;
		return balance - debit;
	}
}

