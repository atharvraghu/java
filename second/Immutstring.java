package second;

public class Immutstring {
    public static void main(String[] args) {
        String str1="hi, i am atharv";
        StringBuilder str= new StringBuilder("");
        str.append(Character.toUpperCase(str1.charAt(0)));
        for (int i=1;i<str1.length();i++){
            if(str1.charAt(i)==' '&& i<str1.length()-1){
                str.append(str1.charAt(i));
                i++;
                str.append(Character.toUpperCase(str1.charAt(i)));
            }
            else{
                str.append(str1.charAt(i));
           }
        }
        System.out.println(str);
   }
}
