package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class matrixBuilder  {
	
	public int [][] matrix = new int [1000][1000];
	public int zero = 0; 
	public int one = 1 ;
	private String filename;
	
	
    public matrixBuilder ( String filename )
    {	
      filename = this.filename ;
    	
	try{
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			String string = scanner.nextLine();
			String[] parts = string.split(" ");
			String part_1 = parts[0];
			String part_2 = parts[1];
			
			int num_1 = Integer.parseInt(part_1);
			int num_2 = Integer.parseInt(part_2);
			matrix[num_1][num_2] = one;
			System.out.println("num1 : " + num_1);
			System.out.println("num2 : " + num_2);
			System.out.println(matrix[num_1][num_2]);
		}
		scanner.close();
	}
	catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}

	
		for (int i =0;i<1000;i++)
			{
			
				System.out.println(i);
			
			for (int j=0;j<1000;j++)
				{
					if (matrix[i][j]!= one)
					{
						matrix[i][j] = zero; 
						System.out.print(j + " :" + matrix[i][j]+ " ") ;
						
						
					}
					else if (matrix[i][j]== one)
					{
						System.out.print(i+ " :" +matrix[i][j] + " ");
					}
					
					
				}	
			
			System.out.println("\n");
			
			}
    }
    
    
}