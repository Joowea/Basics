public interface MyInterfaceA {
    void methodA();

    void methodAbs();

    default void methodDefault(){
        System.out.println("methodDefault in interfaceA");
    }

    default void methodDefaultFu(){
        System.out.println("methodDefault in interfaceA");
    }
}
