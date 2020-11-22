public class Fu {
    static {
        System.out.println("父类静态代码块执行");
    }

    {
        System.out.println("父类非静态代码块执行");
    }

    Fu(){
        System.out.println("父类构造方法执行");
    }
}
