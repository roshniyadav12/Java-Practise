class StringBufferExample{
    public static void main(String args[]){
        StringBuffer sb= new StringBuffer("Roshni Yadav");
          System.out.println("Length : " + sb.length());
          System.out.println("Capacity : " + sb.capacity());
          System.out.println("CharAt index 2 : " + sb.charAt(2));
          System.out.println("Insert : "+ sb.insert(12," IT"));
          System.out.println("Delete : "+ sb.delete(7,15));
          System.out.println("Reverse : "+ sb.reverse());
    }
}
//  