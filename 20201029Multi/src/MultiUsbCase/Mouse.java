package MultiUsbCase;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标接入");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开连接");
    }

    public void useMouse(){
        System.out.println("鼠标正在点击");
    }
}
