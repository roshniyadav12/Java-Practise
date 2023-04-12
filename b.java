//11.table of any number
class b{
	public static void main(String args[]){
	int a=5;
	int n;	int result=1;
	for(n=1; n<=10; n++ ){
		System.out.println(a+ " * " + n+ " = " +a*n);
	}
	}
} 




/* 10. count digits in a number
class b{
	public static void main(String args[]){
		int n=35677;
		int count=0;
		while (n>0){
			n=n/10;
			count++;
		}System.out.println(count);
	}
}*/



/*9 factorial 
class b{
	public static void main(String args[]){
		
		int fac=1;
		int n=6;
		if(n==0){
		System.out.println("1");
		}
		else if(n==1){
		System.out.println("1");
		}
        else{
            for(int a=1; a<=n; a++){
            	fac=fac * a;
            }System.out.println("factorial of " + n + " is " +fac);
        }
	}
}*/




/*8 average and total marks of 5 subject
class b{
	public static void main(String args[]){
		int a=46,b=65,c=56,d=47,e=37;
		int total=a+b+c+d+e;
		double avg=total/(5.0);
		System.out.println(total);
			System.out.println(avg);
	}
}


/* 7
Greatest of three number
import java.util.Scanner;
class b{
	public static void main(String args[]){
		System.out.println("Enter any three number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c){
			System.out.println("a is greater then b and c");
		}
else if(b>c) {
System.out.println("b is greater then a and c");
		}

	else{
		System.out.println("c is greater than a and b");
	}
}
} */


/* 6
calculate power of a number
class b{
	public static void main(String args[]){
	int a=5, b=3;          //a=number b=power c=result
	int c=1;
	for(int i=1; i<=b; i++){
		 c=c*a;
	}System.out.println(c);
	}
}*/


/* 5
Greatest between two numbers
import java.util.Scanner;
class b{
	public static void main(String args[]){
		System.out.println("Enter any two number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a = "+ a +" b = " + b);
		if(a>b){
			System.out.println("a is equal to b");
		}
else if(a==b) {
System.out.println("a is equal to b");
		}

	else{
		System.out.println("b is greater than a");
	}
}
}*/


/*4.
a to z alphabet
class b{
	public static void main(String args[]){
		for(char i='a'; i<='z'; i++)    //for(char i='A'; i<='Z'; i++)
		{
			System.out.println(i);
		}
	}
} */


/* 3
To print ASCII value of character
import java.util.Scanner;
class b{
	public static void main(String args[]){
		char ch;
		System.out.println("Enter any character: ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		int a=ch;
		System.out.println("ACSII value of " + ch + " is " + a);
	}
} */


/* 2.
 character is vowel or consonent
import java.util.Scanner;
class b{
	public static void main(String args[]){
		char ch;
		System.out.println("Enter any character:");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(10);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			System.out.println(ch+ " is Vowel");
		}
		else{
			System.out.println(ch +" is Consonent");
		}
	}

} */


/* 1
character input
import java.util.*;
class b{
public static void main(String a[]){
	char ch;
	System.out.println("Please Enter Character:");
	Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(4);
    System.out.println(ch);
}

} */