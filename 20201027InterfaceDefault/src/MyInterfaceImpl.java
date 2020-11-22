public abstract class MyInterfaceImpl implements MyInterface {
    @Override
    public void methodAbs1() {
        System.out.println("methodAbs1 in implAbs");
    }

    public void methodAbs2() {
        System.out.println("methodAbs2 in implAbs");
    }

    @Override
    public void methodDefault2(){
        System.out.println("methodDefault2 in implAbs");
    }

    @Override
    public void methodDefault3(){
        System.out.println("methodDefault3 in implAbs");
    }
}
