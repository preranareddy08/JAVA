import java.util.*;
class ScannerDemo{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt(); //integer input
    char ch = sc.next().charAt(0); //character input
    String s = sc.next(); //string input
    String st = sc.nextLine(); //sentence input
    Boolean b = true; //boolean input
    Long a = sc.nextLong(); //long input
   Short c = sc.nextShort(); //short input
    Byte bt = sc.nextByte(); //byte input
    Float ft = sc.nextFloat(); //float input
    Double db = sc.nextDouble(); //double input
    
    System.out.println(num);
    System.out.println(ch);
    System.out.println(s);
    System.out.println(st);
    System.out.println(b);
    System.out.println(a);
    System.out.println(c);
   System.out.println(bt);
   System.out.println(ft);
   System.out.println(db);
   }
}