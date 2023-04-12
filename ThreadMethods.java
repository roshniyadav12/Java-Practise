class A extends Thread{
    public void run(){
        Thread t=currentThread();
}
}

class ThreadMethods {
	public static void main(String[] args) {
		A Thread1= new A();
		A Thread2= new A();
             System.out.println("Current Thread name : " + Thread1.getName());
		Thread1.setName("Java");
            System.out.println("Thread name after setting name : " + Thread1.getName());
            System.out.println("Priority of Thread 1 : " + Thread1.getPriority());
		Thread1.setPriority(2);
            System.out.println("Priority of Thread 1 after setting priority : " + Thread1.getPriority());

		Thread1.start();
            System.out.println("Thread 1 is Alive : " + Thread1.isAlive());
		Thread2.start();
        try{
            Thread2.sleep(3000);
            Thread2.join();
        }
        catch(InterruptedException n){
            System.out.println("Interrupted Exception");
        }
        System.out.println("Thread 2 is Alive : " + Thread2.isAlive());
	}
}