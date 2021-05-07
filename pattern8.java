class pattern8
{
	public static void main(String args[])
	{ 
		for(int i=5;i>=1;i--)//for row
		{
			for(int j=2;j<=i;j++)//for space 
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)//for coloum
			{
				 System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
