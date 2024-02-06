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

      catch(Exception e)
        {
          System.out.println(e);
   	}  

   
    
   System.out.println("After Catch");
	Myclass mc = new Myclass();
	System.out.println(mc);

  }

}