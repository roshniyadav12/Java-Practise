import java.util.*;
abstract class dimension{
	int a,b; // a= height, b=base
	Scanner sc=new Scanner(System.in);
	abstract int area();
}
class Rectangle extends dimension{
	int area(){
	System.out.println("Enter length and breadth of Rectangle");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Area of Rectangle is " + a*b);
	return 0;
	}
}
class Triangle extends dimension{
	int area(){
	System.out.println("Enter base and height of Triangle");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Area of Triangle is " + a*b*0.5);
	return 0;
	}
}
public class AbstractClass{
	public static void main(String args[]){
	Rectangle rec = new Rectangle();
	Triangle tri = new Triangle();
	rec.area();
	tri.area();
	}
}