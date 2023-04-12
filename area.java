class Box{
double width;
double height;
double depth;
 

Box(double w,double h, double d){
System.out.println("Constructing Box");
width=w;
height=h;
depth=d;
}


/*Box(){
System.out.println("Constructing Box");
width=10;
height=20;
depth=20;
}
*/



double vol()
{
return width*height*depth;
}
}

class area{
public static void main(String args[]){
Box b = new Box(10.0, 20,20);
//Box b = new Box();

double volume= b.vol();

System.out.println(volume);


}
}