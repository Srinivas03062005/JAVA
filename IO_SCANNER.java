/*public class IO_SCANNER 
{
    public static void main(String[] args) 
    {
        int a=10;
        char c='v';
        System.out.println(a);
        System.out.println(c);

        System.out.print(a);
        System.out.println(c);
        System.out.println("Good Morning");
        System.out.println("Variable a is "+a);
    }
}
*/

import java.util.Scanner;
public class IO_SCANNER 
{
    public static void main(String[] args) 
    {
        int a;
        System.out.println("Please Enter a Value ");
        Scanner s=new Scanner(System.in);
        /*
          int->nextInt()
          float->nextFloat()
          double->nextDouble()
          long->nextLong()
          boolean->nextBoolean()
          string->next()-----> THIS IS FOR A SINGLE WORD
          string->nextLine()------THIS IS FOR A FULL LINE
          char->next().charAt(0)
         */
        a=s.nextInt();
        System.out.println("You Have Entered "+a);
    }
}
