/*
  Q) what is the difference between interface 
  and functional interface?

  A) 
  Interface:
  An interface in Java can contain multiple 
  abstract methods (methods without a body).

  interface MyInterface 
  {
    void method1();
    void method2();
  }



  Functional Interface:
  A functional interface is a specific type
  of interface that has exactly one abstract method.

  Functional interfaces are used primarily in 
  the context of lambda expressions

  @FunctionalInterface
  interface MyFunctionalInterface 
  {
    void singleMethod();
  }

  @FunctionalInterface
  (It indicates that the interface is intended to be a 
  functional interface, which is meant to have exactly 
  one abstract method. This makes the code easier to 
  read and understand.)

  (The annotation helps the compiler enforce the rules 
  of a functional interface. If you mistakenly add a 
  second abstract method to a class annotated with 
  @FunctionalInterface, the compiler will generate an
  error. This provides an additional safeguard against 
  accidental changes that could invalidate the functional
  nature of the interface.)

 */



public class LAMBDAEXPRESSIONS 
{
   public static void main(String[] args) 
   {
         Audi a = new Audi();
         a.drive();



         Car c1 = new Car() 
         {   //Anonymous Class
            public void drive()
            {
                System.out.println("Driving bmw");
            }
         };
         c1.drive();


         
         //Lambda Expression with Anonymous function
         // off 1 which one (room with 1 light , room with 3 lights)
         Car c2 = () -> System.out.println("Driving Suzuki"); 
         /*
           if this single line contains a return statement then no need to write return keyword

           if anonymous function takes parameters then no need to write datatypes only write the variable names

           if  anonymous function takes one parameter then        parameter

           if  anonymous function takes more than one parameter then        (parameter1,parameter2,........)

           if  anonymous function takes zeo parameters then        ()

          */
         c2.drive();

         Car c3 = () ->{ 
          int speed=50;
          System.out.println("Driving TaTa"); 
          System.out.println("Car is driving very smoothly at speed "+speed);
         };
         c3.drive();

   }    
}
class Audi implements Car 
{
    @Override
    public void drive()
    {
        System.out.println("Driving audi");
    }
}
interface Car 
{
    public void drive();
}
