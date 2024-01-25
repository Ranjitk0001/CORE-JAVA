class First
{
int a;
 void showa()
 {
  System.out.println("a:-"+a);
 }

}

class Second extends First
{
int b;

 void showab()
 {
  System.out.println("A:-"+a+"\nB:-"+b);
 }
}

class Inheritance
{
 public static void main(String args[])
 {
  // First f=new Second();
   // f.a=10;
  // f.showa();

  Second f=new Second();
  
  f.a=10;
  f.b=20;
  f.showab();
 }

}
