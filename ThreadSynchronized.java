//ThreadSynchronized.java

class First
{
 synchronized void meth(String str)
  {
   System.out.println("["+str);
    try
      {
       Thread.sleep(10000);
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
 
  MyThread(First z,String mgs)
  {
   f=z;
    str=mgs;

   t=new Thread(this);
   t.start();
  }
 
  public void run()
  {
   f.meth(str);
  }

}

class ThreadSynchronized
{

 public static void main(String args[])
 {
 
  First f1=new First();
  
  new MyThread(f1,"Sp");
  new MyThread(f1,"Academy");
  new MyThread(f1,"Pune");
 }

}






































/* class First
{
  void meth( String str)
  {
    System.out.print("["+str);

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

 Thread  t;
 String str;
 First f;

 MyThread(First z,String message)
 {
   f=z;
   str=message;

   t=new Thread(this);
   t.start();
 }

 public void run()
 {
  f.meth(str);
 }

}
 
class ThreadSynchronized
{
  public static void main(String args[])
  {
    First f1=new First();
    new MyThread(f1,"SP");
    new MyThread(f1,"Academy");
    new MyThread(f1,"Pune");
  }
}
*/
