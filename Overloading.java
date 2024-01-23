Overloading.java
class Number
{
void display()
{
 System.out.println("This is display");
}
void display(int num)
{
 System.out.println("Square="+num*num);
}
void display(int num1,int num2)
{
System.out.println("Mult="+num1*num2);
}
}

class Overloading
{
  public static void main(String args[])
  {
   Number n=new Number();
   n.display();
   n.display(10,11);
   n.display(10);

  }

}

/*o/p :- This is display
Mult=110
Square=100 */
