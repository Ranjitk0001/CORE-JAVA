//ClassInterfaceUsingDMD.java
interface MyInter
{
 void meth();
}

class Class1 implements MyInter
{
  public void meth()
  {
    System.out.println("meth defined in Class1");
  }
}

class Class2 implements MyInter
{
  public void meth()
  {
    System.out.println("meth defined in Class2");
  }
}

class MyClass
{
  void mymeth(MyInter m)
  {
    m.meth();
  }
}

class ClassInterfaceUsingDMD
{
 public static void main(String args[])
 {
  Class1 c1=new Class1();
  Class2 c2=new Class2();

  MyClass m=new MyClass();
  m.mymeth(c1);
  //m.mymeth(c2);

 }


}
