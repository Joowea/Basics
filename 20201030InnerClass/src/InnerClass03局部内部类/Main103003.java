package InnerClass03局部内部类;

public class Main103003 {

    public static void main(String[] args){

        Outer outer = new Outer();

        outer.methodOuter();//想要访问局部内部类中的属性和方法 只需访问到外部类方法即可
    }
}
