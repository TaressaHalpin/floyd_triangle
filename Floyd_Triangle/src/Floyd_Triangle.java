

import java.util.Scanner; 

public class Floyd_Triangle 
{
	public static void main(String args[])
	{
		int trianglerows;
		int number = 0; 
		int counternum; 
		int j;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows_Floyd's Triangle Demo: ");
		
		trianglerows = input.nextInt(); 
		System.out.println("Floyd's Triangle Demo: ");
		System.out.println("**********************************************");
		
		for(counternum = 1; counternum <= trianglerows; counternum++)
		{
			for(j = 1; j <= counternum; j++)
			{
				System.out.print(number + " ");
				number++; 
			}
			   System.out.println();
		}
	}
}