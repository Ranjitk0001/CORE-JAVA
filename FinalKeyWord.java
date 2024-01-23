class Final
{
 
  final int a;
  Final()
  {
   a=100;
  }
  
  Final(int num)
  {
    a=num;
  }
}

class FinalKeyWord
{
 public static void main(String args[])
 {
   Final f= new Final();
  System.out.println("\nThis is the final key word:-"+f.a);

  Final f1=new Final(123);
  System.out.println("\nThis is the final key word:-"+f1.a);
 }

}
