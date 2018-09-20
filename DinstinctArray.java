package JavaPgm;

public class DinstinctArray {

	public static void main(String[] args)
	{
	char[] ch={'a','b','c','d','f','e','f','g','a','z','y','z'};
	for(int i=0;i<ch.length;i++)
	{
		boolean status=false;
		for(int j=0;j<i;j++)
		{
		if(ch[i]==ch[j])
		{
			status=true;
			break;
		}
		}
		if(!status)
		{
			System.out.print(ch[i]+"  ");
		}
		}
	}
	

	}


