//Done by Anand Pandey and Raghav Shukla
import java.util.*;
public class Greedy {
	 public static boolean canJump(int[] nums)
	    {
	    int final_index=nums.length-1;
	     for(int i=nums.length-2;i>=0;i--)
	     {
	      if(i+nums[i]>=final_index)
	          final_index=i;
	         
	         
	     }
	        
	      return final_index==0;  
	    }
	

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);	
     System.out.print("Enter the number of elements");
     int n=sc.nextInt();
     int nums[]=new int[n];
     for(int i=0;i<n;i++)
       nums[i]=sc.nextInt();	 
    
    System.out.println(canJump(nums)); 
	}

}
