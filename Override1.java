import java.util.Scanner;
class shape{
int a,b;
	 void getxyvalue(){
     System.out.println("Enter the value of a and b");
     Scanner sc=new Scanner(System.in);
     a = sc.nextInt();
     b = sc.nextInt();
	}
  void showxyvalue(){
      System.out.println("Shape a = "+a+" b = "+b);
  }
}
class Rectangle extends shape{
       int length=1;
       int breadth=2;
	 void showxyvalue(){
      System.out.println("Rectangle length = "+length+" breadth = "+breadth);
  }
}
class Override1{
	public static void main(String args[]){
	shape obj= new shape();
	obj.getxyvalue();
	obj.showxyvalue();
	Rectangle rec= new Rectangle();
    rec.showxyvalue();

	}
}