package PrimerCourse;

import java.util.Arrays;
import java.util.Scanner;

//Problem Statement
/* 
 * Given a string A, A is made up of 0's and 1's. Break A into substrings such that , 
 * all broken substrings have equal number of 1's and 0's.

Find and return maximum number of substrings in which A can be broken.


Input Format

The only argument given is string A.
Output Format

Find and return maximum number of substrings in which A can be broken.
Constraints

1 <= length of A <= 10^5
A will always have equal number of 0's and 1's
For Example

Input 1:
    A = "011100"
Output 1:
    2
Explanation 1:
    "01" + "1100"

Input 2:
    A = "00011011"
Output 2:
    1
Explanation 2:
    "00011011"
 */

/*
 * Solution :- into 3 steps
 * 1. we need to find the substring of A
 * 2. we need to find the no of zers and ones in it
 * 3. we need to validate the substring on the basis of step 2nd and increase he count of 
 * our valid string
 */
public class OnesAndZeroesArraysValidSubStrings {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary string");
		
		String A = sc.next();
		
		System.out.println("the no of valid substrings Are :" +solve(A));
		
	}
	
	public static int solve(String A) {
		int count=0;
		
		for(int i=0; i<=A.length()-2; i++) {
			
			for(int j=i+1; j<=A.length()-1; j++) {
				int noOfZeroes=0;
				int noOfOnes=0;
				int [] substring = new int[j];
				for(int k=i; k<=j; k++) {
					
					int l=0; 
					if(A.charAt(k)==0) {
						noOfZeroes=noOfZeroes+1;
						
					}
					if(A.charAt(k)==1) {
						noOfOnes=noOfOnes+1;
					}
					substring[i]=A.charAt(k);
					l++;
					System.out.println(noOfZeroes);
				    System.out.println(noOfOnes);
				}
				System.out.println("the substring formed is :" +Arrays.toString(substring));
				if(noOfZeroes == noOfOnes) {
					count= count+1;
				}
			}
		}
	
		  return count;
	}
 
}
