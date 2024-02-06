class TryCatch
{
   public static void main(String args[])
   { 
   
    try{
        //int m=100,n=20 ,k;
        int m=100,n=Integer.parseInt(args[0]) ,k;
        k=m/n;
        System.out.println("k="+k);
       }
   catch( ArithmeticException a)
        {
          System.out.println("Invalid no. you inter");
        }
    System.out.println("After trycatch exception"); 
   }

}

/*
G:\java 1,24>javac TryCatch.java

G:\java 1,24>java TryCatch 2
k=50

G:\java 1,24>java TryCatch
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at TryCatch.main(TryCatch.java:8)

G:\java 1,24>java TryCatch 0
Invalid no. you inter

G:\java 1,24>javac TryCatch.java

G:\java 1,24>java TryCatch 0
Invalid no. you inter
After trycatch exception

G:\java 1,24>java TryCatch
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at TryCatch.main(TryCatch.java:8)


*/