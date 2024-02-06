class TryCatchNested
{
   public static void main(String args[])
   {
      try{
           System.out.println("Start of outer try");
            try
      		  {
                          System.out.println("Start of inner try");
		         int m=100,k,n=Integer.parseInt(args[0]);
		         k=m/n;
		         System.out.println("k="+k);
   			 System.out.println("End of inner try");
        	  }
	     catch(ArithmeticException e)
        	 {
		         System.out.println("Can't divide by zero ");
        	 }
  	   System.out.println("End of outer try");
         } 

     catch(ArrayIndexOutOfBoundsException e)
        {
         System.out.println("insert the input ");
        }
     catch(NumberFormatException e)
        {
         System.out.println("You can only number insert ");
        }
      

   }
}

/*


G:\java 1,24>javac TryCatchNested.java

G:\java 1,24>java TryCatchNested
Start of outer try
Start of inner try
insert the input

G:\java 1,24>java TryCatchNested 5
Start of outer try
Start of inner try
k=20
End of inner try
End of outer try

G:\java 1,24>java TryCatchNested abc
Start of outer try
Start of inner try
You can only number insert

G:\java 1,24>java TryCatchNested 0
Start of outer try
Start of inner try
Can't divide by zero
End of outer try

*/