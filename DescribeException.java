//DescribeException.java
class Myclass 
{
  public String toString()
  {
   return "Myclass: Description of Myclass";

  }

}

class DescribeException
{
  public static void main(String args[])
  {
     try{
         int m=100,n=Integer.parseInt(args[0]);
         int k=m/n;
         System.out.println("k="+k);
        }

      catch(ArithmeticException e)
        {
          System.out.println(e);
   	}
      catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println(e);
   	}  

   
    
   System.out.println("After Catch");
	Myclass mc = new Myclass();
	System.out.println(mc);

  }

}

/*
G:\java 1,24>javac DescribeException.java

G:\java 1,24>java DescribeException 8
k=12
After Catch
Myclass: Description of Myclass

G:\java 1,24>
*/
