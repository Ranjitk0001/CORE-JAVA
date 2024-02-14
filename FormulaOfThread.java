//Formula of creating child thread

Class Mythread implements Runnable
{
 
Thread t;

 Mythread()
 {
  t=new Thread(this);
  t.strat();
 }
 
 public void run()
 {

 }
}

class FormulaOfThread
{
  public static void main(String args[])
  {
   new MyThread();
  }
}