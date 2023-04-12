         /* Constructor */
class Box
{
	double width;
	double height;
	double depth;
Box(double w, double h, double d)
{
	System.out.println("Constructing box");
	width=w;
	height=h;
	depth=d;
}
double volume()
{
	return width*height*depth;
}
double area(){
	return 2*((width*height) + (height*depth) + (depth*width));
}
}
class BoxDemo
{
	public static void main(String args[]){
	Box b1= new Box(10,10,10);
	double vol;
	vol = b1.volume();
    System.out.println("Volume of Box is "+ vol);
    double a=b1.area();
    System.out.println("Area of Box is " + a);
	}
}