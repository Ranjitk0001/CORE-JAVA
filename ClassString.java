//String class

class Demo
{
  public static void main(String args[])
  {
   String str1 ="SP Pune";
   String str2 ="SP Pune";
   String str3 ="SP Pune";
   String str4 ="SP Pune";
   String str5 ="Hello";
   String str6 ="India is my country";

   //METHODS OF"STRING " CLASS:-

   //1) length(): int length()
       System.out.println(str1.length());

   //2)equals():public boolean equals(Object obj)
       System.out.println(str1.equals(str2));
       System.out.println(str1.equals(str5));

   //3)compareTo():public int compareTo(String obj)
       System.out.println(str1.compareTo(str2));
       System.out.println(str1.compareTo(str5));

   //4)toUpperCase():String toUpperCase();
       System.out.println(str1.toUpperCase());

   //5)toLowerCase():String toLowerCase()
       System.out.println(str1.toLowerCase());

   //6)replace(): String replace(char oldChar,char newChar);
       System.out.println(str5.replace("Hello","Java"));

   //7)repclaceAll():String replace(String oldString,String newString);
       System.out.println(str6.replaceAll("n","N"));  

   //8)charAt():char charAt(int index)
       System.out.println(str1.charAt(0));

   //9)substring():String substring(int startIndex,int endIndex)
       System.out.println(str2.substring(1,7));

   //10)indexOf():int indexOf(String searchString)
       System.out.println(str6.indexOf("my"));
       System.out.println(str6.indexOf("myyyy"));
  }
 
}