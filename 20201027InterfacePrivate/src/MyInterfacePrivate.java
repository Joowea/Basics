public interface MyInterfacePrivate {

    default void methodDefault1() {
        System.out.println("methodDefault1 in interface");
        //methodCommon();
    }

    default void methodDefault2() {
        System.out.println("methodDefault2 in interface");
        //methodCommon();
    }

//    java9才有private
//    private void methodCommon() {
//        System.out.println("methodDefault:AAA");
//        System.out.println("methodDefault:BBB");
//        System.out.println("methodDefault:CCC");
//    }
}
