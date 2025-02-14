/*
   StringBuffer provides mutable strings
 */
class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer("prerana");;
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println("append" + ": " + sb1.append('R'));
        //Appends the specified character to this Appendable.
        System.out.println("toString" + ": " + sb1.toString());
        //Returns a string containing the characters in this sequence in the same order as this sequence.
        System.out.println("codePointAt" + ": " + sb1.codePointAt(2));
        //Returns: the code point value of the character at the index 
        System.out.println("toString" + ": " + sb1.deleteCharAt(0));
        //Removes the char at the specified position in this sequence. This sequence is shortened by one char.
        System.out.println("insert" + ": " + sb1.insert(0, "java"));
        //Inserts the string into this character sequence.

    }
}
