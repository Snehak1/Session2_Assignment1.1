package Session_2;

public class Assign_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i=3;i>=1;i--)
		{
			for(int k=3;k>i;k--)
			{
			System.out.print(" ");	
			}
			for(int j=1;j<=(2*i)-1;j++)
			{  if(j==1 || j==((2*i)-1))
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int i=2;i<=3;i++)
		{
			for (int j=3;j>=i+1;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=(2*i)-1;k++)
			{ if(k==1 || k==((2*i)-1))
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}

}
