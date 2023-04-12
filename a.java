
//       odd/even of n natural numbers 
import java.util.Scanner;
class a{
	public static void main(String args[]){
		int a,n;
		System.out.println("Enter the number :");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(a=1; a<=2*n; a=a+2){                   // for even a=0
         {
			System.out.println(a);
		}
				}
		
	}
} 


/* 6.
    sum of odd/even number in given range
import java.util.Scanner;
class a{
	public static void main(String args[]){
		int a,n;
		int sum=0;
		System.out.println("Enter the number :");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
	for(a=1; a<=n; a=a+2){                   // for even a=0
				sum=sum+a;
				}
		System.out.println("Sum of odd number in given range"+sum);
	}
} 





/* 5.
     print odd number in given range
import java.util.Scanner;
class a{
	public static void main(String args[]){
		int a,n;
		System.out.println("Enter the number :");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
	for(a=1; a<=n; a=a+2){                      // for even a=0
				System.out.println(a);
			}
		
	}
} 


/*4.    Sum of N natural numbers
import java.util.Scanner;
class a{
	public static void main(String args[]){
		int a,n,sum;
		sum=0;
		System.out.println("Enter the number of terms :");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(a=1; a<=n; a++){
			sum=sum+a;
		}
		System.out.println("Sum of N natural numbers :" + sum);
	}
} */



/* 3.
 First n natural numbers
import java.util.Scanner;
class a{
	public static void main(String args[]){
		int a,n;
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(a=1; a<=n; a++){
			System.out.println(a);
		}

	}
}*/


/* 2. 
          Sum of two numbers
import java.util.Scanner;
class a{
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter two numbers:");
		Scanner sc =new Scanner(System.in);
		a = sc.nextInt();
		Scanner r =new Scanner(System.in);
		b = r.nextInt();
		c= a+b;
		System.out.println("Sum of two numbers :" + c);
	}
}*/


/* 1. 
         Odd Even Number 
import java.util.Scanner;
class a{
	public static void main(String args[]){
		int n;
		System.out.println("Enter a number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n%2==0){

System.out.println("even");
		}
		else{
System.out.println("odd");
		}
	}
} */