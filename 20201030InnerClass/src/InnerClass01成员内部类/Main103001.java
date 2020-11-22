package InnerClass01成员内部类;

public class Main103001 {

    public static void main(String[] args) {

        Body body = new Body(); //外部类对象

        body.methodBody();

        body.methodGettingInformationFromHeart();
        //第一种成员内部类的使用方法：间接使用 通过外部类方法使用

        System.out.println("________________");

        Body.Heart heart = new Body().new Heart();
        //第二种成员内部类的使用方法：直接使用
        //公式【外部类名称.内部类名称 对象名 = new 外部类名称().new内部类名称();】

        System.out.println(heart.methodHeartBeat());


        /*
        * methodBody in outer class,and my inner class heart is:心脏
          methodGettingInformationFromHeart in outer class whose information from inner class is:"MethodHeartBeat in inner class,and my outer class is:身体"
          ________________
          MethodHeartBeat in inner class,and my outer class is:身体
        * */
    }
}
