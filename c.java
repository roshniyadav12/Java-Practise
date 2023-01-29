
class A extends Thread{
	public void run(){
		try
		{String o= Thread.currentThread().getName();
				for(int i=1; i<=3; i++){
					System.out.println(o);
				}}
				catch(NullPointerException n){
					System.out.println("fun");
				}
	}
}
class c{
	public static void main(String args[]){
		A p= new A();
		A q= new A();
		A r= new A();
		p.setName("Thread 1");
		q.setName("Thread 2");
		r.setName("Thread 3");
		p.start();
		q.start();
		r.start();


	}
}



















/*class c{
	public static void main(String args[]){
String str="roshni";
try{
System.out.println(str.toUpperCase());

}
}
catch(NullPointerException n){
System.out.println("null can't be casted");
}
	}
	
}*/


/* EXCEPTION HANDING
class c{
	public static void main(String args[]){
int a=2,b=0,c;
System.out.println("main method started");
try{c=a/b;
System.out.println(c);
}
catch(ArithmeticException e){
	System.out.println("Can't divide by zero");
	}
	System.out.println("main method ended");
}
}*/