package feb;

import java.util.Scanner;

public class qn10 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int N=input.nextInt();
		int[]arr= new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the sum value");
		int k=input.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
		    if(i!=j&&(arr[i]+arr[j])%k==0) {
					count++;
					
				}
				
			}
		}
		System.out.println(count/2);
	}

}
