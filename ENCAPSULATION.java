/*
   Encapsulation : wrapping up of data(variables) 
   and functions(methods) within 
   a single unit is called encapsulation
   
   it is achieved by creating class

   The main advantage of encapsulation is data protection. 
   By restricting direct access to an object's internal 
   state and exposing only specific methods to interact 
   with that data,
 */

class Student
{
   private int rollnumber;
   private String name;
   private boolean isattended;

   public Student(int rollnumber)
   {
      this.rollnumber=rollnumber;
   }
   public void setstudentattendance(boolean flag)
   {
      isattended=flag;
      System.out.println("Teacher assigned attendance to student as "+flag);
   }
   public boolean getstudentattendance()
   {
      System.out.println("Teacher accesses student attendance");
      return isattended;
   }
}
public class ENCAPSULATION 
{
     public static void main(String[] args) 
     {
        Student s= new Student(101);
        s.setstudentattendance(true);
        boolean c=s.getstudentattendance();
        System.out.println(c);
     }    
}
