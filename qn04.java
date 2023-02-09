package feb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class qn04 {
	public static void main(String[] args) {
		System.out.println("Enter the number user ");
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		List<String> list=new ArrayList();
		List <String> list1=new ArrayList();
		List <String> list2=new ArrayList();
		
		for(int i=0;i<=2*N;i++) {
			String a=input.nextLine();
			list.add(a);
		}
		list.remove(0);
		for(int i=0;i<list.size();i++) {
			if(i%2!=0) {
				list2.add(list.get(i));
			}
			else {
				list1.add(list.get(i));
			}
		}
		for(int i=0;i<N;i++) {
			Set <Character> set=new HashSet();
			 String[] arr=list1.get(i).split(" ");
			 for(int j=0;j<list1.get(i).length();j++) {
				 set.add(list1.get(i).charAt(j));
			 }
			 int m= set.size();
			 String S="";
			 String s="";
			 for(int j=0;j<list2.get(i).length();j++) {
				 set.add(list2.get(i).charAt(j));
				 s=s+list2.get(i).charAt(j);
				 for(int k=0;k<arr.length;k++) {
					 if(s.equals(arr[k])) {
						 S=S+s+" ";
						 s="";
						 break;
					 }
					 
				 }
				 
			 }
			 if(set.size()==m) 
				 System.out.println(S);
				
				 
			 
			 else
				 System.out.println("WRONG PASSWORD");
		     
		}
		    
		    
	
	}

}
