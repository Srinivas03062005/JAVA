/*public class CONDITIONALS 
{
    public static void main(String[] args) 
    {
        int a=30;
        int b=15;
        if(a<b)
        {
            System.out.println("A is less than B");
        }
        else if(a>b)
        {
            System.out.println("B is less than A");
        }
        else
        {
            System.out.println("Both are Equal");
        }
    }
}
*/


public class CONDITIONALS 
{
    public static void main(String[] args) 
    {
        int a=-30;
        int b=30;
        switch(a+b)
        {
            case 0: System.out.println("Sum is zero");
            break;
            case 1: System.out.println("Sum is one");
            break;
            default: System.out.println("Sum is not one/zero");
            break;
        }
    }
}

