package algorithms;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public static List<Vertex> getShortestPathTo(Vertex target)
{
	List<vertex> path = new ArrayList<vertex>();
	for (Vertex vertex= target; vertex !=null; vertex = vertex.previous)
	{
		path.add(vertex);
	}
	
	Collections.reverse(path);
	return path;
}


public static void main ( String  []args) throws IOException
	{
		Scanner in = new  Scanner(System.in) ;
	
		System.out.println(" Please enter the name of your text file");
	    
		String filename = in.nextLine(); 
	
		matrixBuilder(filename);
		
		
		
		
		
		
/*try{
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
			
			
		
		/*BufferedReader br = new BufferedReader( new FileReader(filename));  //used buffer since it is a better way to read a file with large data. 
			try 
			{	//StringBuilder sb = new StringBuilder(); 
				String line = br.readLine();
				
				String[] parts = line.split(" ");
				String part_1 = parts[0];
				String part_2 = parts[1];
				
				while ( line !=null)
				{
						
						int num_1 = Integer.parseInt(part_1);
						int num_2 = Integer.parseInt(part_2);
						matrix[num_1][num_2] = one;
						br.readLine(); 
				}
					
						
					
					
			}
			finally
			{
				br.close();
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
			
			}*/
		
			
			
		}
				
	
		
		
		
	}

