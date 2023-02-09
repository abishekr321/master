package feb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qn07 {
	static void subset(List<List<Integer>> ans,List<Integer> arr,int[] set,int start) {
		ans.add(new ArrayList(arr));
		if(start==set.length) {
			return;
		}
		for(int i=start;i<set.length;i++) {
			arr.add(set[i]);
			subset(ans,arr,set,i+1);
			arr.remove(arr.size()-1);
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int[]set=new int[N];
		for(int i=0;i<N;i++) {
			set[i]=i+1;		}
		List<List<Integer>> ans=new ArrayList();
		List<Integer> arr=new ArrayList();
		subset(ans,arr,set,0);
		System.out.println(ans);
	}

}
