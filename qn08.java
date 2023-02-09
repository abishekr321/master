package feb;

import java.util.Arrays;

public class qn08 {
	public static void main(String[] args) {  
    int[] nums = {5,9,8,2,1,4,3,6,7};  
     for(int k=1; k<nums.length; k++)   {  
        int temp = nums[k];  
        int j= k-1;  
        while(j>=0 && temp <= nums[j])   {  
            nums[j+1] = nums[j];   
            j = j-1;  
        }  
        nums[j+1] = temp;  
    }
     System.out.println(Arrays.toString(nums));
    
}  
	

}
