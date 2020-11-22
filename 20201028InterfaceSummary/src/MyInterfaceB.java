public interface MyInterfaceB {
    void methodB();

    void methodAbs();

    default void methodDefault(){
        System.out.println("methodDefault in interfaceB");
    }
}
