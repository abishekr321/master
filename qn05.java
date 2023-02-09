package feb;

import java.util.Scanner;

public class qn05 {
	public static void main(String [] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter String");
      String a=input.next();
      System.out.println("Enter substring starting index:");
      int i=input.nextInt();
      System.out.println("Enter substring ending index:");
      int j=input.nextInt();
      String temp=a.substring(i-1,j-1);
     int[]freq=new int[26];
      for(char ch:temp.toCharArray())
             freq[ch-97]++;
             int count=0;
             boolean flag=true;
        for( i=0;i<26;i++) {
             if(freq[i]>0) {
                if (freq[i] % 2 == 0)
                    count++;
                else if (flag) {
                    count++;
                    flag = false;
                }
            }
        }
        System.out.println(count);

    }
}



