package PrimerCourse;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class PairSumArray {


	 // Compiler version JDK 11.0.2

	 
	   
	   Scanner sc =new Scanner (System.in);
	   
	   public static int B = 5;
	   public static int[] arr = {2,7,5,10,8,4,6,11};
	   
	   public static void main(String args[])
	   { 
	    System.out.println("Hello, Dcoder!");
	    
	    pairSumArray(arr,B);
	    
	    
	   }
	   
	   public static void  pairSumArray(int [] arr,
	   int B)
	   {
	     int [] count = new int[B];
	     
	     System.out.println(Arrays.toString(count));
	     
	     
	     for(int i=0; i<=arr.length-1; i++)
	     {
	       int index =(arr[i]%B);
	       count[index]=count[index]+1;
	     }
	     System.out.println(Arrays.toString(count));
	     for(int i=0; i<=count.length-1; i++){
	     System.out.println(count[i]);
	     }
	     int nopairsum=(count[0]*count[0]/2);
	     for(int i=0; i<=(count.length-1)/2;i++)
	     {
	       
	       nopairsum = nopairsum+(count[i+1]*count[B-(i+1)]);
	     }
	     System.out.println(" sum pair count is " + nopairsum);
	   }
	 }

