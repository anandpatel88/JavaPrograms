package automationTest;

public class EncapsulationTestcall 
{
	

		public static void main(String[] args)
		{
			EncapsulationTest et=new EncapsulationTest();
			int ac=et.getterAccNumber();
			System.out.println(ac);
			et.setterPass("Anand");
		
		}

}
