package JavaPgm;

public class RemoveJunk
{
	public static void main(String[] args)
	{
		String s="$%^sgjuryyyyyrd";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	
	
	}

}

//Regular Expression[^a-zA-Z0-9]