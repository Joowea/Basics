public class MyInterfaceImpl extends ImplFu implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("override methodA in impl");
    }

    @Override
    public void methodB() {
        System.out.println("override methodB in impl");
    }

    @Override
    public void methodAbs() {
        System.out.println("override methodAbs of interfaceA and interfaceB in impl");
    }

    @Override
    public void methodDefault() {
        System.out.println("override methodDefault of interfaceA and interfaceB in impl");
    }
}
