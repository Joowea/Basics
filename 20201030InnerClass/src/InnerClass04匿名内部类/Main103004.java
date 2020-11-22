package InnerClass04匿名内部类;

public class Main103004 {

    public static void main(String[] args) {

        //如果接口的实现类（或是父类的子类）只需要使用唯一的一次
        //那么这种情况下可以省略掉该类的定义，而改为使用【匿名内部类】
        MyInterface mi = new MyInterface(){

            @Override
            public void methodAbsInInterface() {

                System.out.println("override methodAbsInterface in anonymous inner class");
            }

            @Override
            public void methodAbs2InInterface() {
                System.out.println("override methodAbs2Interface in anonymous inner class");

            }
        };
        mi.methodAbsInInterface();
        mi.methodAbs2InInterface();



        FuAbs fa = new FuAbs(){

            @Override
            void methodAbsInFu() {
                System.out.println("override methodAbsFu in anonymous inner class");
            }
        };
        fa.methodAbsInFu();



        //匿名内部类+匿名对象
        new Fu(){
            @Override
            public void methodInFu() {
                System.out.println("override methodInFu in anonymous inner class");
            }
        }.methodInFu();
    }
}
