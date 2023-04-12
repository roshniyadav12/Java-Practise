class StringExample{
    public static void main(String args[]){
        String s="This is a book";
        String a="Roshni";
        String b="Yadav";
        System.out.println("Length of String : " + s.length());
        System.out.println("String to UpperCase : " + s.toUpperCase());
        System.out.println("String to LowerCase : " + s.toLowerCase());
        System.out.println("String is Empty : "+ s.isEmpty());
        System.out.println("Concatenation : " + a.concat(b));
        System.out.println("Character at 2 index is : " + s.charAt(2));
        System.out.println("Index of character b is : " + s.indexOf('b'));
        System.out.println("b equals to a : "+ b.equals(a));
        System.out.println("Replacing the Character : "+ s.replace('T','S'));

    }
}
