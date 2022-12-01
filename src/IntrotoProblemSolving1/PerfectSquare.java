package IntrotoProblemSolving1;

import java.util.Scanner;

public class PerfectSquare {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	int N=sc.nextInt();
	System.out.println("perfect square of "+N +" is "+perfectSquare(N));
	}
	static int perfectSquare(int N) {
		int i;
		for(i=1; i<=N; i++) {
			
			if(i*i>N) {
				
			}
			else {
			if(i*i == N) {
				break;
				
			}
		 }
		}	
		return i;
	}
}
