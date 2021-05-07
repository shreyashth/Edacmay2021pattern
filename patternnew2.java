class patternnew2
{
	public static void main(String args[])
	{ 
		for(int i=1;i<=5;i++)//12345
		{
			for(int j=5;j>i;j--)//7654321
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)//1234
			{
				
				 System.out.print("*");
				
			}
			
				for(int l=2;l<=i;l++)//12345
			{
				
				 System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
}

