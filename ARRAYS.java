
import java.util.Scanner;
public class ARRAYS 
{
    public static void main(String[] args) 
    {
        //DATATYPE ARRAYNAME[];
        //DATATYPE[] ARRAYNAME;
        /*
          ARRAY DECLARATION EXAMPLE:
          HERE’S AN EXAMPLE OF DECLARING AN INTEGER ARRAY:
          INT[] NUMBERS; // DECLARING AN INTEGER ARRAY
          THIS STATEMENT DECLARES AN ARRAY NAMED NUMBERS THAT WILL HOLD INTEGERS. NOTE: THE ARRAY IS NOT YET INITIALIZED.

          CREATE AN ARRAY
          TO CREATE AN ARRAY, YOU NEED TO ALLOCATE MEMORY FOR IT USING THE NEW KEYWORD:
          NUMBERS = NEW INT[5]; // CREATING AN ARRAY OF 5 INTEGERS
          THIS STATEMENT INITIALIZES THE NUMBERS ARRAY TO HOLD 5 INTEGERS. THE DEFAULT VALUE FOR EACH ELEMENT IS 0.
         */
         int arr[]=new int[5];
         //int arr[]={1,2,3,4,5};
         Scanner s=new Scanner(System.in);
         for(int i=0;i<5;i++)
         {
            System.out.println("Please enter marks of student"+(i+1));
            arr[i]=s.nextInt();
         }
         for(int i=0;i<5;i++)
         {
            System.out.println(arr[i]+" ");
         }

    }
}
