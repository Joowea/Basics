package MultiClassCast;

public class Main102904 {

    public static void main(String[] args) {

        Animal animal1 = new Cat(); //Cat向上转型

        animal1.eat(); //编译看animal是否有eat()  运行使用new Cat()中eat();

        //animal1.work();
        ((Cat) animal1).work(); //向下转型（复原） 后才可使用自己独有的work();

        Animal animal2 = new Dog();

        animal2.eat();

        //animal2.work();
        ((Dog) animal2).work();

        //((Cat)animal2).work();
        // 若发生错误的转型（狗转猫） 编译通过 运行报错 java.lang.ClassCastException 类转换异常



    }


}
