/*
   IN JAVA STRING IS A CLASS
   STRINGS CAN BE CREATED IN 2 WAYS
   1)STRING LITERAL 
   2)NEW OBJECT
 */

 /* 
public class STRINGS 
{
   public static void main(String[] args) 
   {
       String s="Srinivas Muppidi";
       System.out.println(s);
       System.out.println(s.charAt(2));

       String s1=new String("Srinivas Muppidi");
       System.out.println(s1);
   }    
}
*/

/*
In Java, strings created using string literals are immutable. This means that once a String object is created, its content cannot be changed.

If you try to change a character in a string that was created using a string literal, you will encounter the following:

Direct modification won't work: You cannot modify a String directly because Java does not provide methods to change individual characters in a String. For example, attempting something like str[0] = 'A'; will result in a compilation error, as String does not support the array-like modification.
String immutability: Even if you attempt to modify it indirectly (e.g., using methods like replace or substring), those methods return a new string. The original string remains unchanged. For example:


String str = "hello";
str = str.replace('h', 'H');
System.out.println(str); // Outputs "Hello"
Here, str.replace('h', 'H') creates a new string with the change, but the original string "hello" is unaffected until you assign the new string back to str.

Summary:
You cannot directly modify the content of a string literal in Java because strings are immutable.
Any operation that appears to "modify" a string will result in the creation of a new string, leaving the original string unchanged.
 */

 /*
   BUT BY USING STRING OBJECT METHOD WE CAN CHANGE THE CHARACTERS OF A STRING AND STRING ALSO GETS CHANGED WITHOUT THE CREATION OF NEW STRING 
   BUT USING STRNG OBJECT METHOD IS NOT RECOMMEND
  */



  /*
    IN JAVA STRING IS A CLASS BUT WE CANNOT MODIFIEY THE CHARACTERS 
    IN IT WE CAN DO IT WITH STRING OBJECT METHOD BUT IT IS NOT 
    RECOMMEND TO USE SO THERE ARE OTHER TWO STRING CLASSES THERE ARE 
    StringBuffer
    StringBuilder
    BUT THE DIFFERENCE BETWEEN THESE TWO IS 
    StringBuffer 
    StringBuilder 
    SYNTAX:
    StringBuffer s=new StringBuffer("");
    StringBuilder s=new StringBuilder("");
   */



/* 
   public class STRINGS
   {
    public static void main(String[] args) 
    {
    String s1 = "Coding";
    String s2 = "Coding";
    String s3 = new String("Coding");
    
    System.out.print(s1 == s2);
    System.out.print(" ");
    System.out.print(s1 == s3);
    }
    }
*/
    //OUTPUT IS TRUE FALSE 
    //BCZ......
     /*
      s1 == s2: This comparison checks if s1 and s2 reference the same object in memory. 
      Since both s1 and s2 are string literals , they point to the same memory location. 
      Therefore, this expression evaluates to true.

      s1 == s3: This comparison checks if s1 and s3 reference the same object.Since s3 is created using the new keyword, 
      which means it is a separate object in memory, even though it has the same content as s1. Thus, 
      this expression evaluates to false.
     */


     /* 
      public class STRINGS
      {
      public static void main(String[] args) 
      {
      String s1 = "Muppidi"+" Srinivas";
      System.out.print(s1);
      }
      }
      */



      public class STRINGS
      {
      public static void main(String[] args) 
      {
      String s1 = "Muppidi"+" Srinivas";
      String s2 = "muppidi"+" srinivas";
      System.out.println(s1.length());
      System.out.println(s1.indexOf('M'));
      System.out.println(s1.contains("Srinivas"));
      System.out.println(s1.endsWith("as"));
      System.out.println(s1.endsWith("s"));
      System.out.println(s1.toUpperCase());
      System.out.println(s1.toLowerCase());
      System.out.println(s1.equals(s2));
      System.out.println(s1.equalsIgnoreCase(s2));
      }
      }
