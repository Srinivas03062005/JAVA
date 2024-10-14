/*public class BREAK_AND_CONTINUE 
{
    public static void main(String[] args) 
    {
        int i=0;
        while(i<5)
        {
            if(i==2)
            {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
*/

/*
public class BREAK_AND_CONTINUE 
{
    public static void main(String[] args) 
    {
        int i=0;
        while(i<5)
        {
            if(i==2)
            {
                i++;
                continue;
            }
            System.out.println(i); 
            i++;
        }
    }
}
*/


public class BREAK_AND_CONTINUE 
{
    public static void main(String[] args) 
    {
        for(int i=0;i<5;i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.println(i); 
        }
    }
}


