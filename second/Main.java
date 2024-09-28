package second;

public class Main{
    private int you;
    public int getyou(){
        return you;
    }
    public void setyou(int me){
        this.you=me;
        System.out.println(you);
    }
    static int sum(int num){
        while(num>0){
            return num + sum(num-1);
        }
        return 0;
    }
    public int Sum(int start,int end){
        while(start<end){
            return start+Sum(start+1,end);
        }
        return end;
    }
    public static int romanToInt(String s) {
        System.out.println(s.length());
        return 0;
    }

    public static void main(String[] args) {

           Main obj=new Main();
        obj.setyou(10);


    }
}
