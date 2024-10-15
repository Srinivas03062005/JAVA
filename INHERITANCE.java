/*INHERITANCE:INHERITANCE IS A CONCEPT IN PROGRAMMING, PARTICULARLY IN OBJECT-ORIENTED PROGRAMMING, 
WHERE A NEW CLASS (CALLED A SUBCLASS) CAN TAKE PROPERTIES AND BEHAVIORS (METHODS) FROM AN EXISTING 
CLASS (CALLED A SUPERCLASS). THIS ALLOWS FOR CODE REUSE.

     TYPES OF INHERITANCE:

     SINGLE LEVEL INHERITANCE: THIS OCCURS WHEN A CLASS (CHILD) INHERITS 
     FROM ONE SUPERCLASS (PARENT). THERE’S A DIRECT PARENT-CHILD RELATIONSHIP.

     HIERARCHICAL INHERITANCE: IN THIS TYPE, MULTIPLE SUBCLASSES (CHILDREN) 
     INHERIT FROM A SINGLE SUPERCLASS (PARENT). IT FORMS A TREE-LIKE STRUCTURE.

     MULTI-LEVEL INHERITANCE: THIS INVOLVES A CHAIN OF INHERITANCE WHERE A 
     CLASS INHERITS FROM ANOTHER CLASS, WHICH IN TURN INHERITS FROM 
     ANOTHER CLASS, FORMING MULTIPLE LEVELS IN THE HIERARCHY.
*/

class Vehicle
{
    int nowheels;
    String mode;
    
    public void start()
    {
        System.out.println("Starting car");
    }
    public void stop()
    {
        System.out.println("Stopping car");
    }

}
class Car extends Vehicle
{
     int mileage;

     public void applybrake()
     {
        System.out.println("Applying Brakes");
     }
}
public class INHERITANCE
{
    public static void main(String[] args) 
    {
        Car car1=new Car();
        car1.nowheels=4;
        System.out.println("No of Wheels "+car1.nowheels);
        car1.start();
    }
}