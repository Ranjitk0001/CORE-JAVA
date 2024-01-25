class  Outer
{
 Inner i=new Inner();

 int num=i.num;
 
 boolean  checkPrime()
{
 for(int i=2;i<=(num/2);i++)
   if(num%i==0)
     return false;
 return true;
 
}

class Inner
 {
  int num=13;
 }
}

class OuterInnerClasses{

public static void main(String args[])
{

 Outer o=new Outer();
  
if(o.checkPrime())
  System.out.println(o.num+"is Prime"); 
else
  System.out.println(o.num+"is not prime");

}

}
