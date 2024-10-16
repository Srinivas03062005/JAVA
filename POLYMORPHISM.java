/*
   1.POLYMORPHISM IS THE OBJECT ORIENTED PROGRAMMING CONCEPT THAT REFERS TO THE ABILITY OF A VARIABLE ,FUNCTION OR OBJECT
   	    TO TAKE ON MULTIPLE FORMS
   	  2.REAL TIME EXAMPLE WHEN U ARE IN CLASS U WILL BE STUDENT,WHEN U ARE IN SHOP U WILL BE CUSTOMER,WHEN U ARE AT HOME,U WILL BE SON/DAUGHTER
   	  
   	  POLY->MANY
   	  MORPHISM->FORMS
   	  
   	  TYPES OF POLYMORPHISM 
   	  
   	  1.COMPILE TIME POLYMORPHISM(STATIC)->METHOD OVERLOADING
   	  2.RUNTIME POLYMORPHISM(DYNAMIC)->METHOD OVERRIDING
 */

//METHOD OVERLOADING
/*
  Method overloading allows you to define multiple functions with the same name but with different parameters. 
  The compiler determines which function to call based on the number and types of arguments passed to the function  
 */
/*
public class POLYMORPHISM 
{
    void show(int a)
    {
        System.out.println(a+" This is an integer");
    }
    void show(char a)
    {
        System.out.println(a+" This is an character");
    }
    public static void main(String[] args) 
    {
        POLYMORPHISM m=new POLYMORPHISM();
        m.show(2);
        m.show('s');
    }    
}*/

//METHOD OVERRIDING
class A 
{ 
      void show()
      {
        System.out.println("This is show from A class");
      }
}
class B extends A 
{
      void show()
      {
        System.out.println("This is show from B class");
      }
}
public class POLYMORPHISM 
{
    public static void main(String[] args) 
    {
        A obj=new B();
        obj.show();
        /*
          In Java, a reference is a variable that holds the 
          memory address of an object.the reference points to 
          where the object is located in memory.

          you create a reference of type A but instantiate 
          it with an object of type B. This is an example 
          of polymorphism, where a superclass reference can 
          point to a subclass object. The show method that 
          will be invoked depends on the actual object type, 
          not the reference type.
         */
        B obj1=new B();
        obj1.show();
        A obj2=new A();
        obj2.show();
    }    
}
