/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/


class Star
{
	public static void star(int n1)
	{
		int n=n1;
	for (int i=1;i<=n ;i++ )
	{
		for (int j=1;j<=n-i ;j++ )
		{
			System.out.print("  ");
		}
		for (int j=1;j<=2*i-1 ;j++ )
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}

 public static void rev(int n1)
	{
	 int n=n1;
	for (int i=n-1;i>=1 ;i-- )
	{
		for (int j=1;j<=n-i ;j++ )
		{
			System.out.print("  ");
		}
		for (int j=1;j<=2*i-1 ;j++ )
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
class  StarPir2
{
	public static void main(String[] args) 
	{
		int n=6;
     Star.star(n);
	 Star.rev(n);
		
	}
}
