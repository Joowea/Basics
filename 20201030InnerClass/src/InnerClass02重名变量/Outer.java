package InnerClass02重名变量;

public class Outer { //外部类

    int field = 10; //外部类成员变量

    public class Inner { //内部类

        int field = 20; //内部类成员变量

        public void methodInner(){ //内部类方法

            int field = 30; //内部类方法局部变量

            System.out.println(field); //局部变量 就近原则
            System.out.println(this.field); //当前类（内部类）成员变量
            System.out.println(Outer.this.field); //外部类成员变量的 访问方式

        }
    }
}
