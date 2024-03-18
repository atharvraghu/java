package lab1;
public class Main1 extends Shape1{
    public static void main(String[] args) {
        Shape1 c=new Shape1();
        Shape1 r=new Shape1();
        c.circle(5);
        System.out.println("circle radius="+c.x);
        r.rectangle(2, 4);
        System.out.println("rectangle height="+r.x+"  "+"rectagle breadth="+r.y);



    }

    
}
