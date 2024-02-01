class Solid 
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
 
 void Volume()
 {
  System.out.println("Volume in Solid class");
 }

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

class DynamicMemoryDispatch
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




/*

//DynamicMemoryDispatch.java
class Solid
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
 
 void Volume()
 {
  System.out.println("\n-----*------*-----*-----*----*------*------*-------*-----");
  System.out.println("\n This is volume in Solid class");
 }
} 

class Cylinder extends Solid
{

 Cylinder(double d1, double d2)
 {
   super(d1,d2);
 }
 
 void Volume()
 {
   System.out.println("-----*------*-----*-----*----*------*------*-------*-----");
   System.out.println("\nVolume of Cylinder:-"+ 3.14*dim1*dim1*dim2 );
 }

}

class Cone extends Solid
{
 Cone(double d1,double d2)
 {
  super(d1,d2);
 }

 void Volume()
 {
   System.out.println("\n-----*------*-----*-----*----*------*------*-------*-----");
   System.out.println("\nVolume of Cone:-"+ (1.0/4.0)*3.14*dim1*dim1*dim2 );
 }
}
 
class Sphere extends Solid
{
  Sphere(double d1,double d2)
  {
   super(d1,d2);
  }
  
 void Volume()
 {
   System.out.println("\n-----*------*-----*-----*----*------*------*-------*-----");
   System.out.println("\nVolume of Sphere:-"+ (4.0/3.0)*3.14*dim1*dim1*dim1 );
  
 }

}

class Cube extends Solid
{
  Cube( double dim1)
  {
   super(dim1);
  }
 
 void Volume()
 {
   System.out.println("\n-----*------*-----*-----*----*------*------*-------*-----");
   System.out.println("\nVolume of Cube:-"+ dim1*dim1*dim1 );

 }

}

class Myclass{
   void myvolume(Solid s)
   {
      s.Volume(); 
   }
}

class DynamicMemoryDispatch
{

 public static void main(String args[]) 
 {
   Solid so=new Solid(7);
   Cylinder c =new Cylinder(11,12);
   Cone c1 =new Cone(10,19);
   Sphere s=new Sphere(20,12);
   Cube c2= new Cube(12);

   Myclass m=new Myclass();
   m.myvolume(so);
   m.myvolume(c);
   m.myvolume(c1);
   m.myvolume(s);
   m.myvolume(c2);



 }


}

*/
