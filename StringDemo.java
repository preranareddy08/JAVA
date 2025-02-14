/*
-By default Strings are immutable(can't be changed)
 */
class StringDemo {

    public static void main(String[] args) {
        String name = new String("Prerana");

        System.out.println(name.hashCode());
        String s1 = "prerana";
        String s2 = "Prerana";
        name = name + "reddy";
        System.out.println(name);
        System.out.println(s1 == s2);
        System.out.println("STRING METHODS:");
        System.out.println("CharAt" + ": " + name.charAt(4));
        //returns the character at that particular index
        System.out.println("compareTo" + ": " + name.compareTo(s2));
        //returns 0 if name==s2
        //returns <0 if name<s2
        //returns >0 if name>s2
        System.out.println("compareToIgnoreCase" + ": " + name.compareToIgnoreCase(s2));
        //same as compareTo ignores cases
        System.out.println("concat" + ": " + name.concat(s1));
        //concatenates name with s1
        System.out.println("contains" + ": " + name.contains(s2));
        //Returns true if and only if this string(name) contains the specified sequence of char values.
        System.out.println("contentEquals" + ": " + name.contentEquals(s2));
        //Returns: true if this String represents the same sequence of char values as the specified sequence, false otherwise 
        //Note that if the CharSequence is a StringBuffer then the method synchronizes on it.
        System.out.println("endsWith" + ": " + name.endsWith(s2));
        //Returns: true if the character sequence represented by the argument is a suffix of the character sequence represented by this object; false otherwise
        System.out.println("endsWith" + ": " + name.endsWith(""));
        //Note that the result will be true if the argument is the empty string 
        System.out.println("equals" + ": " + name.equals(s2));
        //Returns: true if the given object represents a String equivalent to this string, false otherwise
        System.out.println("equalsIgnoreCase" + ": " + s1.equalsIgnoreCase(s2));
        //Returns: true if the argument is not null and it represents an equivalent String ignoring case; false otherwise
        System.out.println("indexOf" + ": " + name.indexOf('y'));
        //Returns: the index of the first occurrence of the character in the character sequence represented by this object, or -1 if the character does not occur.
        System.out.println("indexOf(String)" + ": " + name.indexOf("reddy"));
        //Returns the index within this string of the first occurrence of the specified substring.
        System.out.println("indexOf(ch,startindex)" + ": " + name.indexOf('a', 2));
        //Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
        System.out.println("isEmpty" + ": " + name.isEmpty());
        //Returns:true if length() is 0, otherwise false
        System.out.println("isBlank" + ": " + name.isBlank());
        //Returns true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println("strip" + ": " + name.strip());
        //Returns a string whose value is this string, with all leading and trailing white space removed.
        System.out.println("substring(startindex)" + ": " + name.substring(3));
        //The substring begins with the character at the specified index and extends to the end of this string.
        System.out.println("substring(startindex,endindex)" + ": " + name.substring(3, 9));
        //The substring begins at the specified beginIndex and extends to the character at index endIndex - 1
        System.out.println("toString" + ": " + name.toString());
        //Returns:the string itself.
        System.out.println("trim" + ": " + name.trim());
        //Returns a string whose value is this string, with all leading and trailing space removed
        //if all characters in this string are space (as defined above), then a String object representing an empty string is returned.
        System.out.println("toCharArray" + ": " + name.toCharArray());
        //Converts this string to a new character array

    }
}
