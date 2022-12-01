package PrimerCourse;

import java.util.Scanner;

public class InverseModulus {

	static Scanner sc=new Scanner(System.in);
	// requirement to find (a/b)%M = (a%b * (b^-1)/M
	/* to find b^-1  hich is called as modular inverse*/
	public static void main(String[] args) {
		
		//(b*x)%M=1
		//then x is inverse mpdulus of b
		
		System.out.println("ente r the value of a and b and m");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int m=sc.nextInt();
		
		//finding moduls of b
		int x= inverseModulus(b,m);
		//using inverse modulus to find division modulus
		int ans= (((a%m)*(x%m))%m);
		System.out.println(ans);
		
	}
	
	 static int inverseModulus(int b, int m){
		// 0<x<=m
		 int x;
		 for( x=1; x<=m;x++) {
			 if(((b*x)%m)==1) {
				 System.out.println("the value of inverse moduls of b is "+x );
			 }
		 }
		 return x;
	}
}
