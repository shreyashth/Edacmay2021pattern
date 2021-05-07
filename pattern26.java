class pattern26
{
	public static void main(String args[])
	{ 
		for(int i=1;i<=6;i++)//for row
		{
			for(int j=1;j<=i;j++)//for space 
			{
				System.out.print("");
			}
			for(int k=6;k>=i;k--)//for coloum
			{
				 System.out.print(" *");
				
			}
			System.out.println();
		}
	}
}
