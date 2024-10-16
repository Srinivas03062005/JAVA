/*
  All fields(fields are variables that are declared within a class) are public,static and final by default
  Summary About Final Keyword:

  Final Variables:
  When a variable is declared as final, its value cannot be changed once it is assigned. This makes it a constant.
  Example:
  final int MAX_VALUE = 100;
  // MAX_VALUE = 200; // This will cause a compile-time error

  Final Methods:
  A method declared as final cannot be overridden by subclasses. This is useful when you want to 
  ensure that the method's implementation remains unchanged in derived classes.
  Example:
  class Parent 
  {
    final void display() 
    {
        System.out.println("This is a final method.");
    }
  }
  class Child extends Parent 
  {
    // void display() 
       { // This will cause a compile-time error
         // System.out.println("Trying to override.");
    // }
   }

   Final Classes:
   A class declared as final cannot be subclassed.
   Example:
   final class Utility 
   {
    // methods
   }
   // class ExtendedUtility extends Utility { // This will cause a compile-time error
   // }

    
  All methods are public and abstract by default
  Interfaces support multiple inheritance(inherting from two classes or many)
 */
interface Person
{
    void talk();
}
class Student implements Person
{
    public void talk()
    {
        System.out.println("Person is talking");
    }
}
public class INTERFACES 
{
    public static void main(String[] args) 
    {
            Student s=new Student();
            s.talk();
    }
}
