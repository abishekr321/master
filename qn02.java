package feb;

import java.util.Arrays;
import java.util.Scanner;

public class qn02 {
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int N=input.nextInt();
	    String[] ans= new String[N+1];
	    for(int i=0;i<N+1;i++) {
	    	ans[i]=input.nextLine();
	    }
	    for(int i=1;i<(N+2)/2;i++) {
	    	ans[i]=ans[i].charAt(0)+" "+"_";
	    	
	    }
	 
	   for(int i=1;i<N+1;i++) {
		   for(int j=i+1;j<N+1;j++) {
			   if(ans[i].charAt(0)>ans[j].charAt(0)) {
				   String temp=ans[i];
				   ans[i]=ans[j];
				   ans[j]=temp;
				 }
	  
			   
		   }
	   }
	   String out="";
	   for(int i=1;i<ans.length;i++) {
		   for(int j=0;j<ans[i].length();j++) {
			   if(ans[i].charAt(j)>='0'&&ans[i].charAt(j)<='9'||ans[i].charAt(j)==' ') {
				   continue;
			   }
			   else {
				   out=out+ans[i].charAt(j);
			   }
		   }
		   out=out+" ";
		   
		   
	   }
	   System.out.println(out);
	    
	}

}
