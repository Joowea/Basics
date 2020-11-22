public interface MyInterfaceA {

    void methodA();

    void methodCommon();

    default void methodDefaultCommon(){
        System.out.println("methodDefaultCommon in interfaceA");
    }
}
