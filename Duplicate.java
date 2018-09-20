package automationTest;

public class Duplicate 
{
 public static void main(String argu[]) 
 {
	
  String s = "I am Kirti Sharma and i am not Modi hater";
  int count=0;
   for(int i=0;i<s.length();i++)
   {
	   if (s.charAt(i)==' ')
	   {
		 count++;  
	   }
   }
   System.out.println("Space is: "+count);
   System.out.println("word is: "+(count+1));
 }
  }
 
