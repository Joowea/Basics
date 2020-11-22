public class Zi1 extends Fu {
    static {
        System.out.println("子类1静态代码块执行");
    }

    {
        System.out.println("子类1非静态代码块执行");
    }

    Zi1(){
        System.out.println("子类1构造方法执行");
    }


}
