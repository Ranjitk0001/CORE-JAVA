// Create 2 child Threads in a class with different logics.
//Assiment1.java

class Numbers implements Runnable
{
  
Thread t;
  int a,b;
  Numbers(String tname)
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
              Thread.sleep(1000);
	    }
	 catch(InterruptedException ie)
	    {

	    }
       } 
  }
}

class Numbers1 implements Runnable
{
  
Thread t;
  int a,b;
  Numbers1()
  {
   t=new Thread(this,"Addition of Numbers:-");
   t.start();
  }
   
  public void run()
  {
    for(int i=1;i<=4;i++)
       {
         System.out.println(t.getName()+" "+(i+i));
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



class  Assiment1
{
 public static void main(String args[])
 {
   new Numbers("Numbers:-");
   new Numbers1();
   
    
}
}