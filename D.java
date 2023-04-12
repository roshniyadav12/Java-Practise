import java.util.Scanner;
class D{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in){
			int size=sc.nextInt();
			int number[]=new int[size];
			for(int i=0; i<size; i++){
				number[i]=sc.nextInt();
			}
			int x=sc.nextInt();
			for(int i=0; i<number.length; i++){
				if(number[i]==x){
					System.out.println("yes");
				}
			}

		}
	}
}











/*import java.util.Scanner;
class f{
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
public int average(){
	return (a+b+c)/3;
	}}
class D{
	public static void main(String args[]){
	f b1= new f();
	int avg;
	avg=b1.average();
	System.out.println("average = "+avg);}
}

















/*Prime Number
import java.util.Scanner;
class D{
public static void main(String args[]){
	int n,count=0;
	System.out.println("Enter any number:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1; i<=n; i++){
if(n%i==0){
	count++;
	}

}
if(count==2){
	System.out.println("Prime Number");

}
else {
	System.out.println("Not a prime number");
}
}
}*/


/*Square root of a number
import java .util.Scanner;
class D{
	public static void main(String[] args) {
		int n,r,arm=0,c;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		double m=Math.sqrt(n);
		System.out.println(m);
		
		}
	}*/


/* ArmStrong Number
import java .util.Scanner;
class D{
	public static void main(String[] args) {
		int n,r,arm=0,c;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0){
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(c==arm){
		System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not an Armstrong number");
		}
	}
}


/* Palindrome Number Program
// input number 141 -> 141
import java.util.Scanner;
class D{
	public static void main(String args[]){
int n, s=0, r, c;
System.out.println("Enter any number");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
c=n;
while(n>0){
	r=n%10;
s=(s*10)+r;
	n=n/10;
}
if(c==s)
{
	System.out.println("Palindrome Number");
}
else{
	System.out.println("Not a Palindrome Number");
}
}
}*/