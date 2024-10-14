/*public class METHDS_OR_FUNCTIONS 
{
   public static void main(String[] args) 
   {
    METHDS_OR_FUNCTIONS m=new METHDS_OR_FUNCTIONS();
    m.sayHello();
    m.addNumbers(2,3);
    m.addNumbers(10,2);
    m.addNumbers(12,7);
   }    
   void sayHello()
   {
        System.out.println("Hello");
   }
   void addNumbers(int a,int b)
   {
    System.out.println(a+b);
   }
}*/




public class METHDS_OR_FUNCTIONS 
{
   public static void main(String[] args) 
   //THIS IS ALSO A FUNCTION VOID RETURN TYPE FUNCTION NAME IS MAIN AND FUNCTION PARAMETERS ARE STRING[] ARGS
   {
      for (String arg : args) 
      {
         System.out.println(arg);
      }
   }    
}
//javac METHDS_OR_FUNCTIONS.java
//java METHDS_OR_FUNCTIONS param1 param2 param3
//java METHDS_OR_FUNCTIONS Hello World 123
/*
  Hello
  World
  123
  THESE PARAMETERS ARE KNOWN AS RUNTIME DATA OR COMMANDLINE ARGUMENTS
 */

