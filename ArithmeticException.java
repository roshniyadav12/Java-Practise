class ArithmeticException{
	public static void main(String args[]){
	int a;
	System.out.println("Main method Started");
	try 
	{
	a=3/0;
	System.out.println(a);
	}
	catch(Exception e){
	System.out.println("Can't divide by zero");
	}
	}
}