package second;
public class rough {
        public static int romanToInt(String s) {
           int r = 0;
           
            for (int i = (s.length()-1);i>0;i--){
                 //int a = s.charAt(i);
                 if(s.charAt(i)=='I'){
                     return 1;
           }
           if (s.charAt(i)=='V'){
               return 5;
           }
            if (s.charAt(i)=='X'){
                return 10;
            }
            if (s.charAt(i)=='L'){
               return 50;
           }
            if (s.charAt(i) =='C'){
               return 100;
           }
            if (s.charAt(i)=='D'){
               return 500;
           }
            if(s.charAt(i)=='M'){
                return 1000;
           }
        //    else {
        //         return 0;
        //    }
                if (s.charAt(i)>s.charAt(i+1)){
                r=r+s.charAt(i);
                }
                else{
                    r=r-s.charAt(i+1);
                }
               
            }
            System.out.println(r);
            return r;
        }
        public static void main(String[] args) {
            romanToInt("CXIX");
        }
}