package second;

public class Threesum {
        public static int[] searchRange(int[] nums, int target) {
            int[] a=new int[2];
            int j=0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    j++;
                }
            }
            if (j == 0) {
                a[0]=-1;
                a[1]=-1;
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
                return a;
            }
            int l=0;
            int r= nums.length-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if (nums[m] == target) {
                    a[0]=m;
                    r=m-1;
                } else if (target>nums[m]) {
                    l=m+1;
                }
                else {
                    r=m-1;
                }
            }
            int shuru=0;
            int antm= nums.length-1;
            while (shuru<=antm){
                int mid=shuru+(antm-shuru)/2;
                if (nums[mid] == target) {
                    a[1]=mid;
                    shuru=mid+1;
                } else if (target>nums[mid]) {
                    shuru=mid+1;
                }
                else {
                    antm=mid-1;
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
            return a;
        }

    public static void main(String[] args) {
        int[] nums={1,4};
        int target=4;
        searchRange(nums,target);
        }
    }

