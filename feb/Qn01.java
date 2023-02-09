package feb;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class qn01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the total price");
		int m=input.nextInt();
		System.out.println("enter the no. types of flavours");
		int n=input.nextInt();
		int[] arr=new int[n];
		Map<Integer,Integer> map=new LinkedHashMap();
		for(int i=0;i<n;i++) {
			 int a=input.nextInt();
			map.put(a,i+1);
			arr[i]=a;
			}

		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(m-arr[i])) {
				  if(m-arr[i]!=arr[i])  
				  System.out.println("the two flavours at"+map.get(arr[i])+","+map.get(m-arr[i]));
				  break;
			}
		}
		
		
		
	}

}
