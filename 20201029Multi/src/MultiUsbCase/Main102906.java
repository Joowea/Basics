package MultiUsbCase;

/*笔记本电脑  鼠标  键盘  USB
* usb作为接口 设计连接 与断开连接方法
* 鼠标 键盘实现接口 重写连接 与断开连接方法 与自己独有的使用方法
* 电脑使用接口 USB接口类型作为方法参数
* */

public class Main102906 {

    public static void main(String[] args) {

        Laptop lp = new Laptop();

        lp.powerOn();

        System.out.println("_______________");

        USB mouse = new Mouse();

        USB keyboard = new KeyBoard();

        lp.useDevice(mouse);

        System.out.println("_______________");

        lp.useDevice(keyboard);

        System.out.println("_______________");

        lp.powerOff();

    }
}
