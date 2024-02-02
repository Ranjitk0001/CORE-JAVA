abstract class First
{
 abstract void meth();

}

class Second extends First
{

  void meth()
  {
    System.out.println("meth define in Second class");
  }
}

class Third extends First
{

  void meth()
  {
    System.out.println("meth define in Third class");
  }
}

class MyClass
{

  First mymeth()
  {
   //return new Second();
   return new Third();
  }

}

class AbstractReturning 
{
  public static void main(String args[])
  { 
   
    
    MyClass m=new MyClass();
    First Obj;
    Obj=m.mymeth();
    Obj.meth();

  }


}
