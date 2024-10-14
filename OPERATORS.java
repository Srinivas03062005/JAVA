/*public class OPERATORS 
{
    public static void main(String[] args) 
    {
        int a=8;
        int b=3;
        int c=a/b;
        System.out.println(c);  //2
    }
}*/

/*
public class OPERATORS 
{
    public static void main(String[] args) 
    {
        int a=8;
        float b=3;
        float c=a/b;
        System.out.println(c); //2.6666667
    }
}
*/

/*
public class OPERATORS 
{
    public static void main(String[] args) 
    {
        int a=8;
        int b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
*/

/* 
public class OPERATORS 
{
    public static void main(String[] args) 
    {
        int a=8;
        int b=2;
        int c=(--a)+b;//PREDECREMENT=DECREASES THE VALUE OF A,THEN USE THE NEW VALUE
        System.out.println(c);//9
    }
}
*/

/* 
public class OPERATORS 
{
    public static void main(String[] args) 
    {
        int a=8;
        int b=2;
        int c=(a--)+b;//POSTDECREMENT=USE THE CURRENT VALUE OF A,THEN DECRREASE ITS VALUE
        System.out.println(c);//10
    }
}
*/

/* 
public class OPERATORS 
{
    public static void main(String[] args) 
    {
        int a=4;
        int b=2;
        //4=0100
        //2=0010
        //a>>b  RIGHT SHIFT     FINAL=A/2^B
          //0100
          //1->0010
          //2->0001->FINAL RESULT IS 1
        System.out.println(a>>b);
    }
}
*/


public class OPERATORS 
{
    public static void main(String[] args) 
    {
        int a=4;
        int b=2;
        //4=0100
        //2=0010
        //a<<b    LEFT SHIFT   FINAL=A*2^B
          //00100
          //1->01000
          //2->10000->FINAL RESULT IS 16
        System.out.println(a<<b);
    }
}