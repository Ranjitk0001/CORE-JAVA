// Extending "Thread" class
//ExtendsThreadClass.java
class MyThread extends Thread
{

 public void run()
 {
  
   for(int i=1;i<=4;i++)
      {
         System.out.println(i);
          
 	 try
	    {
              sleep(1000);
	    }
	catch(InterruptedException ie)
	    {

	    }
      }
 }
}

 class ExtendsThreadClass
{
  public static void main(String args[])
  {
   MyThread m=new MyThread();
   m.start();
  
  }

}
