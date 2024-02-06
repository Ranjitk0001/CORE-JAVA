class Exception
{
   public static void main(String args[])
   { 
    //int m=100,n=20 ,k;
    int m=100,n=Integer.parseInt(args[0]) ,k;
    k=m/n;
    System.out.println("k="+k);
    
   }

}


/*

G:\java 1,24>javac Exception.java

G:\java 1,24>java Exception 5
k=20

G:\java 1,24>java Exception 09
k=11

G:\java 1,24>java Exception 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception.main(Exception.java:7)

G:\java 1,24>java Exception abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at Exception.main(Exception.java:6)

G:\java 1,24>java Exception
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at Exception.main(Exception.java:6)

G:\java 1,24>


*/