package second;

class OuterClass{
    int x=8;

    class InnerClass{
        int y= 2;

    }

    public static void main(String[] args) {
        OuterClass myOuter=new OuterClass();
        OuterClass.InnerClass myInner=myOuter.new InnerClass();
        System.out.println(myInner.y+myOuter.x);

    }
    
}
