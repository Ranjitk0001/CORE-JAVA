class TryCatch1
{
   public static void main(String args[])
   {
     try
        {
         int m=100,k,n=Integer.parseInt(args[0]);
         k=m/n;
         System.out.println("k="+k);
        }
     catch(ArithmeticException e)
        {
         System.out.println("Can't divide by zero ");
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


G:\java 1,24>javac TryCatch1.java

G:\java 1,24>java TryCatch1 2
k=50

G:\java 1,24>java TryCatch1 0
Can't divide by zero

G:\java 1,24>java TryCatch1 sdf
Exception in thread "main" java.lang.NumberFormatException: For input string: "sdf"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at TryCatch1.main(TryCatch1.java:7)

G:\java 1,24>java TryCatch1
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at TryCatch1.main(TryCatch1.java:7)

G:\java 1,24>java TryCatch1 sdf
Exception in thread "main" java.lang.NumberFormatException: For input string: "sdf"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at TryCatch1.main(TryCatch1.java:7)

G:\java 1,24>javac TryCatch1.java

G:\java 1,24>java TryCatch1 2
k=50

G:\java 1,24>java TryCatch1 sdf
You can only number insert

G:\java 1,24>java TryCatch1
insert the input

G:\java 1,24>

*/