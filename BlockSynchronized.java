//BlockSynchronized.java

class First
{
  void meth(String msg)
   {
     System.out.print("[" + msg); 

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
  First f;
  String str;

  MyThread(First z, String message)
   {
     f=z;
     str=message;

     t=new Thread(this);
     t.start();
   }

  public void run()
   {
     synchronized(f)
      {
        f.meth(str); 
      }
   }
}
class BlockSynchronized
{
  public static void main(String args[ ])
   {
     First f1=new First();
     new MyThread(f1, "SP");
     new MyThread(f1, "Academy");
     new MyThread(f1, "Pune");
   }
}

/*
G:\java 1,24>javac BlockSynchronized.java

G:\java 1,24>java BlockSynchronized
[SP]
[Pune]
[Academy]
*/
