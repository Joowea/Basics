public class Main102802 {

    public static void main(String[] args) {

        MyInterfaceImpl MI = new MyInterfaceImpl();

        MI.methodA();
        MI.methodB(); //同时实现两个接口 要重写其中所有抽象方法
        MI.methodAbs(); //两个接口中的同名方法 重写一次即可
        MI.methodDefault(); //两个接口中存在相同的default方法 实现类中必须重写
        System.out.println("_________________");

        MI.methodDefaultFu(); //所继承父类中方法 与所实现接口中default方法重名，优先用父类方法

        /*
        override methodA in impl
        override methodB in impl
        override methodAbs of interfaceA and interfaceB in impl
        override methodDefault of interfaceA and interfaceB in impl
        _________________
        methodDefaultFu in implFu*/
    }
}
