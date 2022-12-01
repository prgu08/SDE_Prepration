package PrimerCourse;

public class APowerBModeM {
	
	
	static int a=10;
	static int b=15;
	static int m=17;
	
	public static void main(String[] args){
	System.out.println(aPowerBModeM(a,b,m));
	}
	
	 static long aPowerBModeM(int a, int b, int m) {
		
		if(b==0) {
			
			return 1;
		}
		
		else if(b%2==0) {
			//System.out.println((aPowerBModeM(((a*a)%m), (b/2),m)));
			return (aPowerBModeM(((a*a)%m), (b/2),m));
		}
		
		else {
			//System.out.println(((a*(aPowerBModeM(((a*a)%m), ((b-1)/2),m)))%m));
			return ((a*(aPowerBModeM(((a*a)%m), ((b-1)/2),m)))%m);
		}
		
		
	}
}