class BankAccount implements Runnable{
	static int Balance=5000;
	static int withdraw;
	BankAccount(int withdraw){
		this.withdraw=withdraw;
	}
	public static synchronized void withdraw(){
	String name=Thread.currentThread().getName();
	if(Balance>=withdraw){
		System.out.println(name+ " withdraws money" );
		Balance= Balance-withdraw;
	}
	else{
		System.out.println("Insufficient Balance");
	}
	}
	public void run(){
		withdraw();
	}
}
class Bank{
	public static void main(String[] args) {
		BankAccount B1= new BankAccount(5000);
		Thread t1=new Thread(B1);
		Thread t2=new Thread(B1);
		t1.setName("Person 1");
		t2.setName("Person 2");

		Bank B2= new Bank(5000);
Thread t3=new Thread(B2);
		Thread t4=new Thread(B2);
		t1.setName("Person 3");
		t2.setName("Person 4");
		t1.start(); t2.start(); t3.start(); t4.start();

	}
}

