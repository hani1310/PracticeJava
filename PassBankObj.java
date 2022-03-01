
public class PassBankObj {

	public static void main(String[] args) {
		Bank account = new Bank("hani",23,500);
		
		//display the contents 
		System.out.println("String :"+ account.getString());
		System.out.println("Age :"+account.getAge());
		System.out.println("Balance : "+account.getBalance());
		System.out.println("Credit :"+account.getCredit());
		System.out.println("Debit : "+account.getDebit());
		
		
		//pass the object
		changeBank(account);

	}

	private static void changeBank(Bank a) 
	{
		a.set("hani",23,100);
	}

}
