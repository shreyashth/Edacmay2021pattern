class pattern2s6
{
	public static void main(String args[])
	{ 
		for(int i=5;i>=1;i--)//for row
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
