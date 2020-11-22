public interface MyInterface {

    // 抽象方法1
    public abstract void methodAbs1();

    // 抽象方法2
    abstract void methodAbs2();

    // 抽象方法3
    public void methodAbs3();

    // 抽象方法4
    void methodAbs4();

    // 默认方法1
    default void methodDefault(){
        System.out.println("methodDefault in interface");
    }
}
