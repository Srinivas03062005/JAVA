/*
  ABSTRACTION IN JAVA, AS PART OF OBJECT-ORIENTED PROGRAMMING (OOP), 
  IS THE CONCEPT OF HIDING COMPLEX IMPLEMENTATION DETAILS AND EXPOSING 
  ONLY THE NECESSARY FEATURES OF AN OBJECT. IT HELPS IN REDUCING 
  PROGRAMMING COMPLEXITY AND INCREASES EFFICIENCY BY ALLOWING THE 
  USER TO INTERACT WITH AN OBJECT WITHOUT NEEDING TO UNDERSTAND 
  ITS INTERNAL WORKINGS.
 */

abstract class Vehicle
{
  public void start()
  {
    System.out.println("Starting");
  }
  abstract public void getNoOfWheels();
}

class Car extends Vehicle
{
  public void getNoOfWheels()
  {
    System.out.println("Car has 4 Wheels");
  }
}

public class ABSTRACTION 
{
    public static void main(String[] args) 
    {
             Car c=new Car();
             c.getNoOfWheels();
         //IN JAVA WE CAN ACHIEVE ABSTRACTION IN TWO WAYS
         //1)INTERFACES (THIS TOPIC NOT YET DONE)
         //2)ABSTRACT KEYWORD AGAIN DIVIDES INTO TWO
           //1)ABSTRACT METHODS
           //2)ABSTRACT CLASSES

         //ABSTRACT CLASS CAN HAVE 1)NON-ABSTRACT METHODS OR 2)ABSTRACT METHODS 

         //BUT ABSTRACT METHOD CAN BE PRESENT ONLY IN AN ABSTRACT CLASS

        /*
           ABSTRACT METHOD:An abstract method is a method declared 
           in an abstract class that does not have a body or
           implementation 

           ABSTRACT CLASS:is a class,which cannot be instantiated
           which cannot be instantiated means that you cannot create 
           an object directly from that class. In other words, you 
           can't use the abstract class to create an instance (an object) 
           of it. Instead, you must create a subclass that extends the 
           abstract class,a subclass of an abstract class must define 
           all the abstract methods in a way that provides specific 
           functionality.we can create objects of a subclass that 
           inherits from an abstract class, but not of the abstract
           class itself.The subclass must provide concrete implementations 
           for all the abstract methods defined in the abstract class.


           For example, in an abstract class Animal, you might have 
           an abstract method makeSound(). Each subclass like Dog or 
           Cat would provide its own implementation of makeSound().
        */   

    }
}

