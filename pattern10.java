class pattern10
	{
public static void main(String args[])
		{
			for (int i = 5; i >= 1; i--)   //rows
				{  
	int alphabet = 64;   
			for (int j = 1; j < i; j++)  //colum spaces
			{  
				System.out.print(" ");  
			}  
          for (int k = i; k <= 5; k++)  //colum alphabet
					{  
				System.out.print((char) (alphabet + k) + " ");  
					}  
				System.out.println();
				}  
		}  
	}  