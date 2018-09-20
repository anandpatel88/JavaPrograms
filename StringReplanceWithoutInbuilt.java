package automationTest;

public class StringReplanceWithoutInbuilt {

	public static void main(String[] args) {
		String s="I use selenium webdriver. selenium is a tool for web application automation.";
		String s1="";
		String[] sArr=s.split(" ");
		System.out.println("String before replacing is: "+s);
		for(int i=0;i<sArr.length;i++)
		{
			if(sArr[i].equalsIgnoreCase("selenium"))
			{
				sArr[i]="firefox";
			}
		}
		for(int i=0;i<sArr.length;i++)
		{
			s1=s1+sArr[i];
			if(i<sArr.length-1)
			{
				s1=s1+" ";
			}
		
		}
		System.out.println("String after replacing is: "+s1);
		
	}

}
