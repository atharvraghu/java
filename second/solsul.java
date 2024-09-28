package second;


public class solsul {
    public static double shortDistance(String str){
        int x=0;
        int y=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='w'){
                x--;
            } else if (str.charAt(i)=='e') {
                x++;
            } else if (str.charAt(i)=='s') {
                y--;
            } else if (str.charAt(i)=='n') {
                y++;
            }
        }
        return  Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String str= "wneenesennn";
        System.out.println(shortDistance(str));
    }
    }
