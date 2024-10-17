/*class A 
{
    int a;
    public void show()
    {
        System.out.println("In Show");
    }
    class B 
    {
         public void config()
         {
            System.out.println("In config");
         }
    }
}

public class INNERCLASSES 
{
    public static void main(String[] args) 
    {
           A obj = new A();
           obj.show();
           
           A.B obj1 = obj.new B();
           obj1.config();
    }    
}*/




class A 
{
    int a;
    public void show()
    {
        System.out.println("In Show");
    }
    static class B 
    {
         public void config()
         {
            System.out.println("In config");
         }
    }
}

public class INNERCLASSES 
{
    public static void main(String[] args) 
    {
           A obj = new A();
           obj.show();
           
           A.B obj1 = new A.B();
           obj1.config();
    }    
}

