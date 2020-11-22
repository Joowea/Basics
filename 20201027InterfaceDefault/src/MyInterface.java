public interface MyInterface {

    void methodAbs1();

    void methodAbs2();

    void methodAbs3();

    default void methodDefault1(){
        System.out.println("methodDefault1 in interface");
    }

    default void methodDefault2(){
        System.out.println("methodDefault2 in interface");
    }

    default void methodDefault3(){
        System.out.println("methodDefault3 in interface");
    }
}
