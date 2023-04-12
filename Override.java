import java.util.Scanner;
class shape{
int a,b;
	 void getxy564value(){
     System.out.println("Enter the value of x and y");
     Scanner sc=new Scanner(System.in);
     a = sc.nextInt();
     b = sc.nextInt();
     System.out.println(a);
     System.out.println(b);
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
class Override{
	public static void main(String args[]){
	shape obj= new shape();
	obj.showxyvalue();
	Rectangle rec= new Rectangle();
    rec.showxyvalue();

	}
}