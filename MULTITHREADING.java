/*

use case of threads : 
when you call two functions one after the other,
the second function will only start after the first
one has finished. This is called sequential execution.

With threads, you can run both functions concurrently.
By creating two threads and assigning one function to
each thread, both threads can execute their respective
functions at (roughly) the same time, allowing them to
work in parallel. This is known as concurrent execution. 


 1. Task
Definition: A task is a specific work 
that needs to be completed.

Real-time Example: Imagine you’re a chef in a 
restaurant. Your task might be to prepare a 
specific dish, like a pasta dish. In Java, a
task could be represented by a method or a 
function that performs a specific job, like 
processing user input.



2. Process
Definition: A process is an instance of a 
program that is being executed. It contains 
its own memory space and resources.

Real-time Example: Think of a restaurant as 
a process. When you open the restaurant, it 
starts running and can handle various tasks, 
like cooking, taking orders, and serving food.
In Java, when you run a program, it creates a
process. For example, if you run a Java 
application that manages a library system,
the entire library system is a process that
manages all tasks related to book management.



3. Thread
Real-time Example: Within the restaurant (the process),
there are multiple chefs (threads) working simultaneously.
One chef might be cooking pasta, another might be 
preparing salads, and another might be plating desserts.
Each chef can perform their tasks independently but 
all contribute to the overall operation of the restaurant.
In Java, you can create multiple threads to perform 
different tasks concurrently, like reading from a file
while processing user input, allowing the application
to be more efficient and responsive.
 */


/*
 public class MULTITHREADING
 {
    public static void main(String[] args) 
    {
             System.out.println("Hello Guys,Welcome");
             System.out.println(Thread.activeCount()); //1
             System.out.println(Thread.currentThread().getName());
             System.out.println(Thread.currentThread().getId());
             
               //System.out.println(Thread.currentThread().getPriority());
               //MIN PRIORITY 1
               //NOR PRIORITY 5
               //MAX PRIORITY 10
               //You can set thread priorities,range 1 to 10
              
              Thread t1 = new Thread();
              System.out.println(Thread.activeCount());  //STILL 1 bcz t1 is not active its just created
               
    }
 }
 */



/*
 public class MULTITHREADING
 {
    public static void main(String[] args) 
    {
        Thread t1 = new Thread();
        t1.start();       //inside,thread class run function will be called
        Thread t2 = new Thread();
        t2.start();
        Thread t3 = new Thread();
        t3.start();
        Thread t4 = new Thread();
        t4.start();
        System.out.println(Thread.activeCount()); //The main thread itself is always counted as active
        
         //FIRST TIME EXECUTION O/P 3 (2 THREADS DEADDDDD)
         //SECOND TIME EXECUTION O/P 4(1 THREAD DEADDDDD)
         
               
    }
 }
 */

/* 
class Employee extends Thread
{
         @Override
         public void run()
         {
            System.out.println("Hello");
         }
}
 public class MULTITHREADING
 {
    public static void main(String[] args) 
    {
        Employee t1 = new Employee();
        t1.start(); 
        System.out.println(Thread.activeCount()); 
      
    }
 }
    O/P : 2
          Hello
*/
 /* 
O/P EXPLANATION : 
When you call t1.start(), it triggers the run() 
method of the Employee thread to execute. However,
the main thread (which is executing main()) continues
to run concurrently with the new thread. The main 
thread may reach the System.out.println(Thread.activeCount()) 
line before the Employee thread has a chance to print "Hello."
*/


/*
class Employee extends Thread
{
         public Employee(String name)
         {
            super(name); // Calls the constructor of Thread with the name parameter
         }
         @Override
         public void run()
         {
            System.out.println("Hello "+Thread.currentThread().getName()+"-"+Thread.currentThread().getId());
         }
}

class Manager extends Thread
{
         public Manager(String name)
         {
            super(name); // Calls the constructor of Thread with the name parameter
         }
         @Override
         public void run()
         {
            System.out.println("Hi "+Thread.currentThread().getName()+"-"+Thread.currentThread().getId());
         }
}
 public class MULTITHREADING
 {
    public static void main(String[] args) 
    {
        Employee e1 = new Employee("T1");
        e1.start();
        Manager m1 = new Manager("T2");
        m1.start(); 
        System.out.println(Thread.activeCount()); 
      
    }
 }*/

 //By default java only provides 2 ways to create threads in Java 
 //1) extends thread
 //Completed...........


 
class Employee implements Runnable
{
         @Override
         public void run()
         {
            System.out.println("Hello "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId());
         }
}

class Manager implements Runnable
{
         @Override
         public void run()
         {
            System.out.println("Hi "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId());
         }
}
 public class MULTITHREADING
 {
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        Thread t1 = new Thread(e1,"T1");
        t1.start();

        Manager m1 = new Manager();
        Thread t2 = new Thread(m1,"T2");
        t2.start();
        System.out.println(Thread.activeCount()); 
      
    }
 }

 //2)implements Runnable
 //Completed...........

 /*
   Why do we need this second approach?

   Java allows a class to extend only one other class due to 
   its single inheritance model. If you extend Thread, you 
   cannot extend any other class.

   //allowed
   class classname extends superclassname implements interfacename
   {

   }

   class classname extends superclassname implements  firstinterfacename,secondinterfacename
   {

   } 

   class classname implements firstinterfacename,secondinterfacename
   {

   }

  */



  