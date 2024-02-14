//Theatre 
class Theatre implements Runnable
{
   Thread t;
   Theatre(String tname)
   {
    t=new Thread(this ,tname);
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

class TheatreShows
{ 
  public static  void main (String args[])
  {
    new Theatre("ticket");
    new Theatre("shows:-");
  }


}