package MultiUsbCase;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘接入");
    }

    @Override
    public void close() {
        System.out.println("键盘断开连接");
    }

    public void useKeyboard(){
        System.out.println("键盘正在键入");
    }
}
