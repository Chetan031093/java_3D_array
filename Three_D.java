// java programme to create 3-D array without instantiation
public class Three_D 
{
	public static void main(String[] args)
	{
		int ar1[][][] = {
		             		{{1,2,3},{2,3,4},{4,5,6}},
		             		{{7,8,9},{5,6,8},{4,8,6}},
		             		{{4,5,6},{47,8,6},{7,5,6}}
		                };
		
		for (int i = 0; i < ar1.length; i++) 
		{
			for (int j = 0; j < ar1[i].length; j++)
			{
				for (int j2 = 0; j2 < ar1[i][j].length; j2++) 
				{
					System.out.print(ar1[i][j][j2]+" ");
				}
				System.out.println();
						
			}
			System.out.println();
		}
	}                 
}
