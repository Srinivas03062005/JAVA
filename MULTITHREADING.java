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



//MultiThreading : Multithreading is a programming technique that 
//allows multiple threads to run concurrently within a single process




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


 
/*class Employee implements Runnable
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
 }*/

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




 /*public class MULTITHREADING
 {
    public static void main(String[] args) 
    {
      Runnable r1 = new Runnable()
      {         //anonymous class
         public void run()
         {
            System.out.println("Hello "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId());
         }
      };

      Runnable r2 = new Runnable()
      {
         public void run()
         {
            System.out.println("Hi "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId());
         }
      };

      Thread t1 = new Thread(r1,"T1");
      Thread t2 = new Thread(r2,"T2");
      
      t1.start();
      t2.start();
    }
 }*/
 /*
    The Runnable interface is part of the Java standard library,
    defined in the java.lang package. It contains a single method, run()
  */
// 3) Completed...........






/* 
public class MULTITHREADING
{
   public static void main(String[] args) 
   {
     Runnable r1 = () -> 
     { 
       for(int i=0;i<10;i++)
       {
         System.out.println("Hello "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId()); 
       }
     };


     Runnable r2 = () -> 
     { 
       for(int i=0;i<10;i++)
       {
         System.out.println("Hi "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId()); 
       }
     };

     Thread t1 = new Thread(r1,"T1");
     Thread t2 = new Thread(r2,"T2");
     
     t1.start();
     t2.start();
   }
}*/
// 4) Completed...........



/*
public class MULTITHREADING
{
   public static void main(String[] args) throws Throwable
   {
     Runnable r1 = () -> 
     { 
       for(int i=0;i<10;i++)
       {
         System.out.println("Hello "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId()); 
       }
     };


     Runnable r2 = () -> 
     { 
       for(int i=0;i<10;i++)
       {
         System.out.println("Hi "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId()); 
       }
     };

     Thread t1 = new Thread(r1,"T1");
     Thread t2 = new Thread(r2,"T2");
     
     t1.start();
     //t1.join(); // By using this,t2 will start after t1 dies //like normal functions
     //t1.sleep(10000);
     t2.start();
   }
}*/




/*
     THREAD LIFE CYCLE
     0 - New
     1 - Runnable
     2 - Blocked
     3 - Waiting(join)
     4 - Timed Waiting(specific time/sleep)
     5 - Terminated


     Explanation For Blocked State : 
     Imagine you and your friend want to play with a toy, but 
     there’s only one toy and you both want to use it at the same time.

     Here’s how it works:
     You Start Playing: You grab the toy first and start
     playing with it. This is like a thread that starts working.
     Your Friend Waits: Your friend wants to play too, but they 
     have to wait until you’re done because you’re still using 
     the toy. This is like a thread that is in the Blocked state—it
     can't do anything until you finish.

     Finishing Up: After you finish playing, you give the toy
     to your friend. Now they can play! This is when the thread
     that was blocked can start working.
*/

/*public class MULTITHREADING
{
   public static void main(String[] args) 
   {
     Runnable r1 = () -> 
     { 
       for(int i=0;i<10;i++)
       {
         //System.out.println("Hello "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId()); 
       }
     };


     Runnable r2 = () -> 
     { 
       for(int i=0;i<10;i++)
       {
         //System.out.println("Hi "+Thread.currentThread().getName()+"---"+Thread.currentThread().getId()); 
       }
     };

     Thread t1 = new Thread(r1,"T1");
     Thread t2 = new Thread(r2,"T2");
     System.out.println(t1.getState());
     
     t1.start();
     System.out.println(t1.getState());
     t2.start();
     System.out.println(t1.getState());
   }
}*/





//Brick Business Example
/* 
 public class MULTITHREADING
 {
    public static void main(String[] args) throws Throwable
    {
      BrickDairy bd = new BrickDairy();
      Runnable r1 = () -> 
      { 
        for(int i=0;i<10000;i+=50)
        {
             //Unloading The 50 Bricks
             bd.incrementBrickCount();
        }
      };
      Runnable r2 = () -> 
      { 
        for(int i=0;i<15000;i+=50)
        {
            //Unloading The 50 Bricks
            bd.incrementBrickCount();
        }
      };
      Runnable r3 = () -> 
      { 
        for(int i=0;i<5000;i+=50)
        {
            //Unloading The 50 Bricks
            bd.incrementBrickCount();
        }
      };
 
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      Thread t3 = new Thread(r3);
 
      t1.start();
      t2.start();
      t3.start();


      t1.join();
      t2.join();
      t3.join();
 
      System.out.println(bd.brickCount);
    }
 }
 
 class BrickDairy 
 {
    int brickCount = 0;
    public void incrementBrickCount()
    {
       brickCount += 50;
    }
 }
    */

 /*

   RACE CONDITIONS : 
   _________________


   all three threads (t1, t2, and t3) are started almost simultaneously,
   meaning they run concurrently.

   When you call t1.start(), t2.start(), and t3.start(),
   all three threads begin executing their tasks in parallel. This means 
   that they can run at the same time

   After starting the threads, you use t1.join(), t2.join(),
   and t3.join(). The join() method makes the main thread (the one executing main()) 
   wait for each specified thread to finish. So the main thread will wait for t1 to 
   complete before moving on to wait for t2, and then wait for t3.


   
   While the join() calls ensure that the main thread waits for t1, t2, and
   t3 to finish before proceeding, the actual output of bd.brickCount may 
   not always be 30000 due to (potential race conditions) in the incrementBrickCount() method.

   two or more threads might read and update the brickCount at the same time,
   leading to lost updates. 
   For example:
   If t1 reads brickCount as 0 and t2 reads it as 0 almost simultaneously,
   both might add 50 to 0, resulting in brickCount only being updated to 50 instead of 100.

   As a result of these race conditions, the final value of brickCount can be less 
   than 30000, even though the threads have all completed their execution.

  */


//Solution for the above Problem.......
/*public class MULTITHREADING
 {
    public static void main(String[] args) throws Throwable
    {
      BrickDairy bd = new BrickDairy();
      Runnable r1 = () -> 
      { 
        for(int i=0;i<10000;i+=50)
        {
             //Unloading The 50 Bricks
             bd.incrementBrickCount();
        }
      };
      Runnable r2 = () -> 
      { 
        for(int i=0;i<15000;i+=50)
        {
            //Unloading The 50 Bricks
            bd.incrementBrickCount();
        }
      };
      Runnable r3 = () -> 
      { 
        for(int i=0;i<5000;i+=50)
        {
            //Unloading The 50 Bricks
            bd.incrementBrickCount();
        }
      };
 
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      Thread t3 = new Thread(r3);
 
      t1.start();
      t2.start();
      t3.start();


      t1.join();
      t2.join();
      t3.join();
 
      System.out.println(bd.brickCount);
    }
 }
 
 class BrickDairy 
 {
    int brickCount = 0;
    public synchronized void incrementBrickCount()
    {
       brickCount += 50;
    }
 }*/
/*
  synchronized keyword indicates that the method can only be accessed 
  by one thread at a time. If one thread is executing this method, other
  threads trying to execute it will be blocked until the first thread finishes.
 */

 public class MULTITHREADING
 {
    public static void main(String[] args) throws Throwable
    {
      BrickDairy bd = new BrickDairy();

      Runnable r1 = () -> 
      { 
        for(int i=0;i<10000;i+=50)
        {
             //Unloading The 50 Bricks
             bd.incrementBrickCount();
        }
      };
      Runnable r2 = () -> 
      { 
        for(int i=0;i<15000;i+=50)
        {
            //Unloading The 50 Bricks
            bd.incrementBrickCount();
        }
      };
      Runnable r3 = () -> 
      { 
        for(int i=0;i<5000;i+=50)
        {
            //Unloading The 50 Bricks
            bd.incrementBrickCount();
        }
      };
 
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      Thread t3 = new Thread(r3);
 
      t1.start();
      t2.start();
      t3.start();


      t1.join();
      t2.join();
      t3.join();
 
      System.out.println(bd.brickCount);
      System.out.println(bd.brickCount2);
    }
 }
 
 class BrickDairy 
 {
    int brickCount = 0;
    int brickCount2 = 0;
    void fun(int brickCount)
    {
      this.brickCount=brickCount;
    }
    public void incrementBrickCount()
    {
      synchronized(this)
      {
         brickCount += 50;
      }
       brickCount2 += 50;
    }
 }

 /*
  When you use synchronized (this), it means that the current
  object (the instance of the class) will be locked, ensuring
  that only one thread can execute the synchronized block at 
  a time for that particular object.
  */
