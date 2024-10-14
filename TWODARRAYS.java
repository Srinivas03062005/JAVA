
/*import java.util.Scanner;
public class TWODARRAYS 
{
    public static void main(String[] args) 
    {
        int arr[][]=new int[2][3];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Please enter element at row = "+(i+1)+" and column = "+(j+1));
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
*/

//ROW IS NECESSARY TO SPECIFY WHEN INITIALISING AN ARRAY
public class TWODARRAYS 
{
    public static void main(String args[]) 
    {
    int arr[][] = new int[3][];
    arr[0] = new int[1];
    arr[1] = new int[2];
    arr[2] = new int[3];
    int sum = 0;
    for(int i = 0 ; i < 3 ; ++i)
    {
        for (int j = 0; j < i + 1 ; ++j)
        {
            arr[i][j] = j + 1;
        }
    }
    for(int i = 0 ; i < 3 ; ++i)
    {
        for (int j = 0 ; j < i + 1 ; ++j)
        {
            sum += arr[i][j];
        }
    }
    System.out.print(sum);
    }
}
/*
  THE ABOVE 2D ARRAY LOOKS LIKE THIS 
  1
  1 2
  1 2 3
 */




