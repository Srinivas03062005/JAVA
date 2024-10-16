/*
                  EXCEPTION HANDLING
                  ERRORS
                  WHAT IS THE DIFFERENCE BETWEEN EXCEPTION HANDLING AND ERRORS?
                

                  EXCEPTION  AND ERRORS, BOTH ARE CALLED AS USUAL PROGRAM BLOCKERS
                  
                  ERRORS ARE NOTHING BUT BASIC SYNTAX MISTAKES
                  EXCEPTION HANDLING OCCURS WHEN UNEXPECTED EVENTS OCCURS
 */
/*
public class EXCEPTION_HANDLING 
{
    public static void main(String[] args) 
    {
           String s="Srinivas";
           try
           {
              System.out.println(s.charAt(9));
           }
           catch(StringIndexOutOfBoundsException e)
           {
            System.out.println(e);
           }
    }
}*/ // o/p : java.lang.StringIndexOutOfBoundsException: String index out of range: 9



/* 
public class EXCEPTION_HANDLING 
{
    public static void main(String[] args) 
    {
           String s="Srinivas";
           try
           {
              System.out.println(s.charAt(5));
           }
           catch(StringIndexOutOfBoundsException e)
           {
            System.out.println(e);
           }
    }
}*/ // o/p : v


/*public class EXCEPTION_HANDLING 
{
    public static void main(String[] args) 
    {
           int a=10;
           int b=0;
           int c=0;
           try
           {
              c=a/b;
           }
           catch(ArithmeticException e)
           {
            System.out.println(e);
            System.out.println("You are trying to divide by zero.it is undefined!");
           }
           System.out.println(c);
    }
}*/
/*
   o/p : 
   java.lang.ArithmeticException: / by zero
   You are trying to divide by zero.it is undefined!
   0
 */



 
/*public class EXCEPTION_HANDLING 
{
    public static void main(String[] args) 
    {
           int a=10;
           int b=2;
           int c=0;
           try
           {
              c=a/b;
           }
           catch(ArithmeticException e)
           {
            System.out.println(e);
            System.out.println("You are trying to divide by zero.it is undefined!");
           }
           System.out.println(c);
    }
}*/   // o/p : 5 



//To Catch Any Exception Use -> Throwable

/*
  finally :  finally block is used in exception handling 
  to execute important code regardless of whether an 
  exception is thrown or not
 */


class Illegal extends Exception
{
    Illegal(String s)
    {
        System.out.println(s);
    }
}
 public class EXCEPTION_HANDLING 
{
    void vote(int age) throws Illegal
    {
        if(age<18)
        {
           throw new Illegal("Age is not sufficient");
        }
        else
        {
           System.out.println("You can Vote");
        }
    }
    public static void main(String[] args) 
    {
        EXCEPTION_HANDLING obj=new EXCEPTION_HANDLING ();
        try 
        {
            obj.vote(4);
        }
        catch(Exception e) 
        {
            System.out.println(e);
            //the catch block can print the class of the caught exception object
        }
        finally
        {
           System.out.println("Thank You");
        }
    }
}

