package automationTest;

public class ReverseStringWithPreservingSpace
{

	public static void main(String[] args)
	{
		String s="my name is anand";
		char[] sa=s.toCharArray();
		char[] resultArray = new char[sa.length];
		 for (int i = 0; i < sa.length; i++) 
	        {
	            if (sa[i] == ' ') 
	            {
	                resultArray[i] = ' ';
	            }
	        }
	       int j = resultArray.length-1;
		  for (int i = 0; i < sa.length; i++)
	        {
	            if (sa[i] != ' ') 
	            {  
	                if(resultArray[j] == ' ')
	                {
	                    j--;
	                }
	                 
	                resultArray[j] = sa[i];
	                 
	                j--;
	            }
	        }
	         
	        System.out.println(s+" ---> "+String.valueOf(resultArray));
	    }
		
	}


