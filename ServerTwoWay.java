import java.io.*;
import java.net.*;

class ServerTwoWay
{
  public static void main(String args[ ])
   {
     while(true)
     {
      try
        {
	 ServerSocket ss=new ServerSocket(47);
         Socket s=ss.accept();
     
	 //Reading data from client
	 InputStream is= s.getInputStream();
	 ObjectInputStream ois=new ObjectInputStream(is);
    	 String data=(String)ois.readObject();
 	 System.out.println("Client say:"+data);

	  //Sending data to Client
 	  OutputStream os= s.getOutputStream(); 
	  ObjectOutputStream oos=new ObjectOutputStream(os);

	  DataInputStream dis=new DataInputStream(System.in);
          System.out.println("Enter data to be sent to client");
          data=dis.readLine();
	  oos.writeObject(data);

	 oos.close();
 	 os.close();
	
         ois.close();
	 is.close();
	 s.close();
         ss.close();
        }
      catch(Throwable e)
        {
 	  System.out.println(e);
        }
          

     }
   }
}

