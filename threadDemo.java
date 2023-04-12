class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Thread is running - "+i);
            System.out.println("CSVTU");
        }
    }
}
class threadDemo{
    public static void main(String args[]){
        MyThread s=new MyThread();
        s.start();
    }
}