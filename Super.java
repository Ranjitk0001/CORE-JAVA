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
