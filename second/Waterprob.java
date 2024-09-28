package second;

public class Waterprob {
    public static int maxArea(int[] height) {
        int maxarea=0;
        int mxarea=0;
        int p1=0;
        int p2=height.length-1;
        while(p1< height.length && p1!=p2){
            maxarea=height[p1]<height[p2]?(p2-p1)*height[p1]:(p2-p1)*height[p2];
            mxarea=maxarea>mxarea?maxarea:mxarea;
            if(height[p1]<height[p2]){
                p1++;
            }
            else
            { p2--;};
        }
        return mxarea;
    }

    public static void main(String[] args) {
        int[] height={2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }

}
