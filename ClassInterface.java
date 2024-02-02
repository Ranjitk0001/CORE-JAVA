interface MyInter
{
  void meth1();
  void meth2();
}

class MyClass implements MyInter
{
  public void meth1()
   {
     System.out.println("This is meth1");
   }

  public void meth2()
   {
     System.out.println("This is meth2");
   }

  void meth3()
   {
     System.out.println("This is meth3");
   }
}

class ClassInterface
{
  public static void main(String args[ ])
   {
     MyClass m=new MyClass();
     m.meth1();
     m.meth2();
     m.meth3();
   }
}
