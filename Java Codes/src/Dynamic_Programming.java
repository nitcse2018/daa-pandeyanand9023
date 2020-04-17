//Done by Anand_Pandey and Raghav Shukla
//181210009 and 181210038
public class Dynamic_Programming {
	
	 static int numberOfPaths(int m, int n) 
	    { 
	        // Create a 2D table to store results 
	        // of subproblems 
	        int count[][] = new int[m][n]; 
	  
	        // Count of paths to reach any cell in 
	        // first column is 1 
	        for (int i = 0; i < m; i++) 
	            count[i][0] = 1; 
	  
	        // Count of paths to reach any cell in 
	        // first column is 1 
	        for (int j = 0; j < n; j++) 
	            count[0][j] = 1; 
	  
	        // Calculate count of paths for other 
	        // cells in bottom-up manner using 
	        // the recursive solution 
	        for (int i = 1; i < m; i++) { 
	            for (int j = 1; j < n; j++) 
	  
	                
	                count[i][j] = count[i - 1][j] + count[i][j - 1]; //+ count[i-1][j-1]; 
	        } 
	        return count[m - 1][n - 1]; 
	    } 

	public static void main(String[] args) 
	{
	
    System.out.print(numberOfPaths(3,3));
	}

}
