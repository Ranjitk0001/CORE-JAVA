Super.java

class First
{
int a=100;


}

class Second extends First
{
int a=200;
 void access()
  {

  System.out.println(super.a);

  }
}

class Super
{
 public static void main(String args[])
 {
     Second s =new Second();
     System.out.println(s.a);//200
     s.access();//100
    
 }
}

/**s.java
class s 
{
 public static void main(String args[])
 {
  Mybox m=new Mybox(10,10,10,5);
  m.valume();
 m.mass();
  
  
 }
}

/*
G:\java 1,24>javac s.java

G:\java 1,24>java s
Valume=1000.0

G:\java 1,24>javac s.java

G:\java 1,24>java s
Valume=1000.0
Mass=5000.0

G:\java 1,24>javac Super.java

G:\java 1,24>java Super
Valume=1000.0
Mass=5000.0

G:\java 1,24>javac s.java

*/

**/

/*

//Super.java
class Box 
{
 double height,length,width;
  Box(double w,double h,double l)
  {
   width=w;
   height=h;
   length=l;
  }
  
  void valume()
  {
   System.out.println("Valume=" +width*height*length);
  }
}

class Mybox extends Box
{
double density;
  Mybox(double w,double h,double l, double d)
  {
   super(w,h,l);
   density=d;
  }
 
  void mass()
  {
    System.out.println("Mass=" +width*height*length*density);
  }
}

class Super 
{
 public static void main(String args[])
 {
  Mybox m=new Mybox(10,10,10,5);
  m.valume();
  m.mass();
  
  
 }
}


*/
