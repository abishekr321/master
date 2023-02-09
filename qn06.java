package feb;

import java.util.Arrays;
import java.util.Scanner;

public class qn06 {
	   public static int[][] rotateArray(int[] []arr,int N) {
		   int k=0,l=0;
		   int[][] ans=new int[N][N];
		   for(int coloumn= N-1;coloumn>=0;coloumn--) {
				for(int row=0;row<N;row++) {
					if(l>=N) {
						k++;
						l=0;
					}
				  ans[k][l++]	=arr[row][coloumn];
				}
			}
		   return ans;
	   }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();
		int [][] arr=new int[N][N];
		int n=1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j]=n++;
				
				
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	arr=rotateArray(arr,N).clone();
	for(int i=0;i<N;i++) {
		for(int j=0;j<N;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
		
	}

}
