package MultiClassCast;

public class Dog extends Animal {

    static String name = "dog";

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void work(){
        System.out.println("狗看家");
    }
}
