package automationTest;
public class ReverseSentence 
{

	public static void main(String[] args) 
	{
		String s="my name is raj and i am automation tester";
		String rev="";
	String[] s1=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		for(int j=s1[i].length()-1;j>=0;j--)
		{
			rev=rev+s1[i].charAt(j);
		}
		rev=rev+" ";
	}
	System.out.println("Sentence before reversing of words: "+s);
	System.out.println("Sentence before reversing of words: "+rev);
	
	}
}


