 /*
     1
	 1 1
	 1 2 1
	 1 2 2 1
	 1 2 2 2 1
 
 */

class Pali
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				if (j==1 || j==i)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("2 ");
				}
			}
			System.out.println();
		}
	}
}
