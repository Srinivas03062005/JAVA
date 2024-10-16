/*
   static variable - class variable

   static method - class method

   a block can also be static
   static
   { 
     
   }
   
   nested classes can be static
 */



//static variable - class variable
/*
class Person
{
    static String cityName;
    String name;
}
public class STATICKEYWORD 
{
   public static void main(String[] args) 
   {
       Person.cityName="Delhi";
       Person p1=new Person();
       Person p2=new Person();
       p1.name="Ram";
       p2.name="Bheem";

       System.out.println(p1.name+" lives in "+p1.cityName);
       System.out.println(p2.name+" lives in "+p2.cityName);
   }    
}
*/



//static method - class method
/*
class MathUtils 
{
    public static int add(int a, int b) 
    {
        return a + b;
    }
}
public class STATICKEYWORD 
{
    public static void main(String[] args) 
    {
        int result = MathUtils.add(5, 3);
        System.out.println(result);  // Output: 8
    }
}
*/



//nested classes can be static
/*
  SYNTAX:
  class outer
  {
    static class nestedinner
    { 
       
    }
  }
*/
/* 
  In Java, a static nested class is a nested 
  class that is declared static. This means it 
  can be instantiated without an instance of 
  the enclosing (outer) class

  The class NestedClass is declared as static. 
  his means it is associated with the outer 
  class STATICKEYWORD rather than an instance 
  of it.

  In the main method, you can create an instance 
  of NestedClass without needing an instance of 
  STATICKEYWORD. This is done using the syntax 
  STATICKEYWORD.NestedClass n = new 
  STATICKEYWORD.NestedClass();.
  
  public class STATICKEYWORD
  {  
     private static class NestedClass
     { 
       public void display()
       {
          System.out.println("This is a static nested class");
       }
     }

     public static void main(String[] args) 
     {
        STATICKEYWORD.NestedClass n=new STATICKEYWORD.NestedClass();
        n.display();
     }
  }
*/
 
