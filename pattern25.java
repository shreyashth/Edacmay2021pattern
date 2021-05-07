class pattern25
{
	public static void main(String args[])
	{ 
		for(int i=1;i<=5;i++)//for row
		{
			for(int j=5;j>i;j--)//for space 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)//for coloum
			{
				
				 System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
