abstract class Solid 
{
 double dim1,dim2;

 Solid(double d1,double d2)
 {
  dim1=d1;
  dim2=d2;
 }
 Solid(double d1)
 {
  dim1=d1;

 }
 
 abstract void Volume();
 

}

class Cube extends Solid
{
 Cube(double side)
 {
  super(side);
 } 
 void Volume()
 {
  System.out.println("Cube:-"+ dim1*dim1*dim1 );
 }
 
}
class Sphered extends Solid
{
 Sphered(double radius)
 {
  super(radius);
 } 
 void Volume()
 {
  System.out.println("Sphered:-"+(4.0/1.0)* 3.14*dim1*dim1*dim1 );
 }
 
}

class Cylinder extends Solid
{
 Cylinder(double radius,double height)
 {
  super(radius,height);
 } 
 void Volume()
 {
  System.out.println("Cylinder:-"+ 3.14*dim1*dim1*dim2 );
 }
 
}

 class Cone extends Solid
{
 Cone(double radius,double height)
 {
  super(radius,height);
 } 
 void Volume()
 {
  System.out.println("Cone:-"+ (1.0/3.0)*3.14*dim1*dim1*dim2 );
 }
 
}
class MyClass
{
 void MyVolume(Solid s)
 {
  s.Volume();
 }
}

class Abstract
{
 public static void main(String args[])
 { 
  /*
  Solid s ;
  s=new Cube(10);
  s.Volume();
  */

  Cube c =new Cube(10);
  Sphered s=new Sphered(10);
  Cylinder cy=new Cylinder(10 ,13);
  Cone co= new Cone(10,13);
  MyClass m =new MyClass ();
  m.MyVolume(c);
  m.MyVolume(s);
  m.MyVolume(cy);
  m.MyVolume(co);
  
 
 }

}
