//Multiple resources

//MultiThreadSynchronized.java

class First
{
 synchronized void meth(String str)
  {
   System.out.println("["+str);
    try
      {
       Thread.sleep(1000);
      }
    catch(InterruptedException ie)
      {

      }
   System.out.println("]");
  }
}

class MyThread implements Runnable
{
 Thread t;
 String str;
 First f;
 
  MyThread(String mgs)
  {
    f=new First();
    str=mgs;

   t=new Thread(this);
   t.start();
  }
 
  public void run()
  {
   f.meth(str);
  }

}

class MultiThreadSynchronized
{

 public static void main(String args[])
 {
 
 // First f1=new First();
  
  new MyThread("Sp");
  new MyThread("Academy");
  new MyThread("Pune");
 }

}

/*
G:\java 1,24>javac MultiThreadSynchronized.java

G:\java 1,24>java MultiThreadSynchronized
[Sp
[Pune
[Academy
]
]
]
*/