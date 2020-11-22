package InnerClass03局部内部类;

public class Outer { //外部类

    public void methodOuter(){ //外部类方法

        class Inner { //局部内部类（在外部类方法中的类 且只有当前方法才能使用它）

            int num = 10; //有效final☆ final可以省略（java8）

            public void methodInner(){ //局部内部类方法

                System.out.println("methodInner of inner class in methodOuter");

                System.out.println("num:"+ num);
                //局部内部类 如果希望访问所在方法的局部变量 那么这个变量必须是有效final的☆
                //原因是 生命周期问题
            }
        }

        //由于局部内部类只能在方法内部访问 因此基于局部内部类的创建对象 必须在方法中完成
        //想要访问局部内部类中的属性和方法 只需访问到外部类方法即可
        Inner inner = new Inner();
        inner.methodInner();
    }
}
