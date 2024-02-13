//Method in "Thread " class

 class Threadclass
{
 public static void main(String args[])
  {
    Thread t;
    t=Thread.currentThread();
    System.out.println(t);   
  
    t.setName("MyThread");
    System.out.println(t); 

    String tname=t.getName();  
    System.out.println(tname);   
   for(int i=1;i<=4;i++)
    {
       System.out.println(i);
   try
      {      
          t.sleep(1000);              
      }
   catch(InterruptedException ie)
      {
       System.out.println("Thread Intrrupted");
      }
   }
 }

}

/*
:\java 1,24>javac Threadclass.java

G:\java 1,24>java Threadclass
Thread[#1,main,5,main]
Thread[#1,MyThread,5,main]
MyThread
1
2
3
4
*/