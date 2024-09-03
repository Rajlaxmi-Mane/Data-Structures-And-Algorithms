/*
    *
   * *
  *   *
 *     *
* * * * *
*/

class HollowTri2
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n-i ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=3;j<=2*i;j++ )
			{
				if (j==3 || i==1 || j==2*i || i==n)
				{
					System.out.print("*");
				}
				else{
				
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
