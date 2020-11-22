package InnerClass02重名变量;

public class Main103002 {

    public static void main(String[] args) {

        Outer.Inner oi = new Outer().new Inner();

        System.out.println(oi.field);

        oi.methodInner();
    }
}
