/*
   1
   a b
   2 3 4
   c d e f
   5 6 7 8 9
   g h i j k l

*/

class Pat5 
{
	public static void main(String[] args) 
	{
		int a=1;
		char ch='a';
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(ch++ +" ");
				}
				else {
					System.out.print(a++ +" ");
				}
			}
			System.out.println();
		}
	}
}
