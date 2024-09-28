package second;

import java.util.Arrays;

public class Sol2 {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int count=0;
        if(nums.length<=1&&nums[0]!=1||nums[0]>1){
            return 1;
        } else if (nums.length<=1&&nums[0]==1) {
            return 2;
        }
        for(int i=0;i< nums.length-1;i++){
            if (nums[i]==1) {
                count++;
            }
            if(nums[i+1]-nums[i]==1&&i==nums.length-2){
                ans= nums[i+1]+1;
            }
            if(nums[i+1]-nums[i]!=1) {
                ans = nums[i] + 1;
            }
            if(ans>0){
                return ans;
            }
        }
        if(count==0){
            return 1;
        } else if (count!=0) {
            return ans;
        }
        return 1;
    }
 public static void main(String[] args) {
  int[] nums={7,8,9,11,12};
     System.out.println(firstMissingPositive(nums));

 }

}


