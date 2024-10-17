/*
It is an inner class without a name and for
 which only a single object is created.
An anonymous inner class can be useful when 
making an instance of an object with certain
“extras” such as overriding methods of a class 
or interface, without having to actually subclass
 a class.
 */
class A 
{
    public void show()
    {
        System.out.println("In A Show");
    }
}
public class ANONYMOUS_INNER_CLASS 
{
   public static void main(String[] args) 
   {
        A obj = new A()
        {
            
            public void show()
            {
                System.out.println("In new Show");
            }
        };
        obj.show();

        A obj1 = new A();
        obj1.show();

        A obj2 = new A()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        obj2.show();
   }    
}
