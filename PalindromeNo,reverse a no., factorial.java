class Factorial{
    public static void main(String args[]){
        int i,fact=1;
        int n=5;
        for(i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact +" is factorial of "+ n);
    }
}

/*class ReverseNo{
    public static void main(String args[]){
        int r,sum=0 ;
        int n=246885;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}*/

/*class PalindromeNo{
    public static void main(String args[]){
        int r, temp,sum=0;
        int n=25;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10) + r;
            n=n/10;

        }
        if(temp==sum){
            System.out.println(temp +" is a palindrome number");
        }
        else{
            System.out.println(temp +" is not a palindrome number");
        }
    }
} */