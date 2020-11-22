package MultiClassCast;

public class Cat extends Animal {

    static String name = "cat";

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void work(){
        System.out.println("猫抓老鼠");
    }
}
