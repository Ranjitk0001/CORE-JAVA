
import java.io.*;
import java.net.*;

class MyClient
{
  public static void main(String args[])
  {
 
   try
   {
     Socket s=new Socket("localhost",47);
   
    //sending data to server
     OutputStream os=s.getOutputStream();
     DataInputStream dis=new DataInputStream(System.in);
     System.out.println("Enter data to be sent to server");
     String data= dis.readLine();
     byte arr[]=data.getBytes();
     os.write(arr);

     //Closing alll objects();
     os.close();
     s.close();

   }
   catch(Throwable e) 
   {
    System.out.println(e);
   }
 
  }
}
/*
1)G:\java 1,24>javac MyClient.java
Note: MyClient.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

3G:\java 1,24>java MyClient
Enter data to be sent to server
Ranjit

G:\java 1,24>

*/