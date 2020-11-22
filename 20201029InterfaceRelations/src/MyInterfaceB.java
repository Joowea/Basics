public interface MyInterfaceB {

    void methodB();

    void methodCommon();

    default void methodDefaultCommon(){
        System.out.println("methodDefaultCommon in interfaceB");
    }

}
