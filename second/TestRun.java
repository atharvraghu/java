package second;
import java.util.Arrays;
public class TestRun {
    public static void main(String arg[]){
        int[] nums={7,8,9,11,12};
        System.out.println(firstMissingsPositive(nums));
    }
    private static int firstMissingsPositive(int[] nums) {
        int firstpositive=0;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]>0){
                firstpositive=i;
                break;
            }
        }
        if(nums[firstpositive]<0)
            return 1;
        for(int j = 1; ;j++){

        }
    }
}
