
/*
    0
	1 0
	1 0 1
	0 1 0 1
	1 0 1 0 1
	0 1 0 1 0 1

	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15

*/

class Pat4 
{
	public static void main(String[] args) 
	{
		int a=1;
		for (int i=1;i<=6 ;i++ )

		{
			
			for (int j=1;j<=i ;j++ )
			{

				int sum=i+j;
				if(sum%2==0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

		System.out.println();
		 for (int i=1;i<=5 ;i++ )
		 {
			 for (int j=1;j<=i;j++ )
			 {
				 System.out.print(a++ +" ");
			 }
			 System.out.println();
		 }
	}
}
