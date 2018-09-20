package JavaPgm;

public class MergeTwoArray {

	public static void main(String[] args)
	{

     int a[]={10,23,20};
     int b[]={20,33,40};
     int c[]=new int[a.length+b.length];
     for(int i=0;i<a.length;i++)
     {
    	 c[i]=a[i];
    	
     }
     int p=0;
     for(int j=a.length;j<c.length;j++)
     {
    	 c[j]=b[p];
    	 p++;
    	
     }
     for(int m:c)
     {
    	 System.out.print(m+ " ");
     }
	}

}
