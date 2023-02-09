package feb;

import java.util.Scanner;

public class qn09 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int[][] arr=new int[N][N];
		int k=0;
	   int row=N-1,col=N-1,r=0,c=0;
	   while(r<=row&&c<=col) {
		   for(int i=c;i<=col;i++) {
			   if(r%2==0)
			     arr[r][i]=1;
			   else
				 arr[r][i]=0;
		   }
		   r++;
		   for(int i=r;i<=row;i++) {
			   if(col%2==0)
				   arr[i][col]=1;
			   else
				   arr[i][col]=0;
		   }
		   col--;
		   if(c<=col)
		   for(int i=col;i>=c;i--) {
			   if(row%2==0) 
				     arr[row][i]=1;
			   else
				   arr[row][i]=0;
			   
		   }
		   row--;
		   if(r<=row)
		   for(int i=row;i>=r;i--) {
			   if(c%2==0)
				   arr[i][c]=1;
			   else
				   arr[i][c]=0;
		   }
		   c++;
			 
			    	
				
			}
	   for(int i=0;i<N;i++) {
		   for(int j=0;j<N;j++) {
			   System.out.print(arr[i][j]);
			   
		   }
		   System.out.println();
	   }
		}
		
	}


