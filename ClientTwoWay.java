import java.io.*;
import java.net.*;

class ClientTwoWay
{
  public static void main(String args[ ])
   {
     while(true)
     {
      try
        {
          Socket s=new Socket("localhost",47);
	  //Sending data to server
 	  OutputStream os= s.getOutputStream(); 
	  ObjectOutputStream oos=new ObjectOutputStream(os);

	  DataInputStream dis=new DataInputStream(System.in);
          System.out.println("Enter data to be sent to server");
          String data=dis.readLine();
	  oos.writeObject(data);

         //Reading data from Server
	 InputStream is= s.getInputStream();
	 ObjectInputStream ois=new ObjectInputStream(is);
    	 data=(String)ois.readObject();
 	 System.out.println("Server say:"+data);
	 
         ois.close();
	 is.close();
         
	 oos.close();
	 os.close();
	 s.close();
        }
      catch(Throwable e)
        {
          System.out.println(e);
        }
     }
   }
}







