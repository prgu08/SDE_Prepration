package IntroductionToArrays;

import java.util.Arrays;

public class SumOf1DarrayAccordingtoRangeOF2DArray {
	
	
	
	public static void main(String[] args) {
		int [] A = {1,2,3,4,5};
		int [] [] B = { {1,4} ,
				{2,3}};
		
		System.out.println(Arrays.toString(solve(A,B)));
	}
	
	
	
	public static int[] solve(int[] A, int[][] B) {
        int Brows= B.length;
        int Bcolumns=B[0].length;

        int [] ans = new int[Brows];

        for(int i=0; i<Brows; i++){
            for(int j=0; j<Bcolumns-1; j++){
                ans[i]=sumOfQuery(B[i][j] , B[i][j+1], A);
            }
        }

        return ans;
    }

    public static int sumOfQuery(int s_indx, int l_indx, int [] A){
        int sum=0;
        for(int i=s_indx-1; i<=l_indx-1; i++){
           sum += A[i];
        }
        return sum;
    }
}


