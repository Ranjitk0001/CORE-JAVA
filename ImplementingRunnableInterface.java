//Creating our own child thread
//ImplementingRunnableInterface.java

class ThreadLogic implements Runnable
{
  public void run()
  {
   for(int i=1;i<=4;i++)
   {
    System.out.println(i);
     
      try
         {
           Thread.sleep(1000);
         }
     catch(InterruptedException ie)
         {

         }
   }
  }
}

class MyThread
{
 Thread t;
 void createThread()
 {
  ThreadLogic tl=new ThreadLogic();
  t=new Thread(tl);
 }
  
 void beginThread()
 {
  t.start();
 }

}



class ImplementingRunnableInterface
{
 public static void main(String args[])
 {
  MyThread m=new MyThread();
  m.createThread();
  //m.beginThread();
 m.t.start();

 }

}

/*

G:\java 1,24>java ImplementingRunnableInterface
1
2
3
4
*/