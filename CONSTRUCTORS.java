public class CONSTRUCTORS 
{
    int i;
    char c;

    CONSTRUCTORS()  //DEFAULT CONSTRUCTOR
    {
        //CONSTRUCTOR:THIS IS ALSO A FUNCTION, THIS IS 
        // AUTOMATICALLY CALLED WHEN AN OBJECT IS CREATED
        System.out.println("Object Is Created"); 
    }
    CONSTRUCTORS(int i) //PARAMETERISED CONSTRUCTOR
    {
        this.i=i;
        System.out.println("Object Is Createddddd");
    }
    public static void main(String[] args) 
    {
        CONSTRUCTORS t=new CONSTRUCTORS();   
        CONSTRUCTORS u=new CONSTRUCTORS();
        CONSTRUCTORS v=new CONSTRUCTORS();
        CONSTRUCTORS x=new CONSTRUCTORS();
        CONSTRUCTORS a=new CONSTRUCTORS(25); 

        System.out.println(a.i);
    }    
}
