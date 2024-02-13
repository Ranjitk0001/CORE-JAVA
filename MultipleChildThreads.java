//Creating multiple child threads
// MultipleChildThreads.java

class MyThread implements Runnable
{
 Thread t; 
 MyThread( String tname)
 {
  t=new Thread(this,tname);
  t.start(); 
}

  
 public void run()
 {
 for(int i=1;i<=4;i++)
  {
    System.out.println(t.getName()+" "+i);

    try 
      {
       t.sleep(1000);
      }
   catch(InterruptedException ie)
      {

      }
  }
 }

}


class MultipleChildThreads
{
 public static void main(String args[])
 {
   new MyThread("One:");
   new MyThread("Two:");
   new MyThread("Three:");//Can not be sequencily excuted
 }

}

/*
G:\java 1,24>javac MultipleChildThreads.java

G:\java 1,24>java MultipleChildThreads
One: 1
Three: 1
Two: 1
Two: 2
One: 2
Three: 2
Two: 3
Three: 3
One: 3
Two: 4
One: 4
Three: 4

G:\java 1,24>java MultipleChildThreads
Three: 1
One: 1
Two: 1
Three: 2
Two: 2
One: 2
One: 3
Two: 3
Three: 3
Three: 4
One: 4
Two: 4


*/