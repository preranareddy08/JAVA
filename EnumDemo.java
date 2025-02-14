/*
  -In Java, an enum (short for enumeration) is a special data type that enables a variable to be a set of predefined constants.
  -Enums are used to represent a fixed set of values, such as days of the week, seasons, or states in a state machine. 
  -They improve code readability, type safety, and maintainability.
  -Each value in an enum is a constant and is implicitly public, static, and final.
  -Enums can have methods, constructors, and fields, making them more powerful than simple constants.
  -Enums implicitly implement the Comparable and Serializable interfaces.
  -Enum class cannot be extended.
**Common Methods in Enum:
  -values(): Returns an array of all enum constants.
  -valueOf(String name): Returns the enum constant with the specified name.
  -ordinal(): Returns the position of the enum constant in the declaration (starting from 0).

*/
enum Status{
    running, success, failed, pending;  //these are all objects
}
class EnumDemo{
    public static void main(String args[])
    {
        Status s = Status.running;
        System.out.println(s);
        System.out.println(s.ordinal()); //ordinal gives the index of the specified element
        //TO PRINT ALL THE VALUES
        Status ss[] = Status.values();
        for(Status st:ss)
        {
            System.out.println(st+" "+st.ordinal());
        }
        
    }

}