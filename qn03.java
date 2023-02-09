package feb;
import java.util.Arrays;
import java.util.Scanner;

public class qn03 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the size of expenditure ");
		int size=input.nextInt();
		System.out.println("no.of trailing days");
		int days=input.nextInt();
		int median=0;
		int count=0;
		int[] expenditure=new int[size];
		int [] arr=new int[days];

		for(int i=0;i<size;i++) {
			expenditure[i]=input.nextInt();
			if(i<days) {
				arr[i]=expenditure[i];
				
			}
			
		}
		
		for(int k=days;k<size;k++) {
		for(int i=0;i<days;i++) {
			for(int j=i+1;j<days;j++) {
				if(arr[i]>arr[j]) {
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
			}
			if(i==days-1) {
				if(days%2==0) {
					median=(arr[days/2]+arr[(days/2)-1])/2;
					
				}
				else {
					median=arr[days/2];
				}
			}
			
		}   
		    arr[(k-days)%days]=expenditure[k];
			if(expenditure[k]>= 2*median) {
				count++;
			}
			
		}
		System.out.println(count);
		
	
		
	}

}
