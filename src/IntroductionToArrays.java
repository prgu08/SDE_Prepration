import java.util.Scanner;

public class IntroductionToArrays {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter teh size of array");
		//int N=sc.nextInt();
		
		int [] arr= { 510827, 351151, 96897, 925335, 299818, 192489, 456948, 44720, 510589, 598577};
		
		//int [] arr= {1,2,2};
		/*
		 * int arr []= new int[N];
		 * System.out.println("Enter the elements of Array"); for(int i=0; i<arr.length;
		 * i++) { arr[i]=sc.nextInt(); }
		 */
	
		System.out.println("Enter the B");
		int B= sc.nextInt();
		System.out.println(solve(arr,B));
		
	}
	public static int solve(int[] A, int B) {
        int answer=0;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
            	
            	int sum = (A[i]+A[j]);
                if((sum%B)==(B%B)){
                    System.out.println("array sum "+(sum%B) +" b%B " +B%B );
                  answer = 1;
                  break;
                }
                  else
                  {
                      answer = 0;
                  }
                  
                
               
            }
        }
        return answer;
    }
}
