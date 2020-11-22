package Multi01Field;

public class Main102903 {

    public static void main(String[] args) {

        Fu obj = new Zi();

        System.out.println(obj.num);
        //直接访问 看等号左边Fu //10

        System.out.println(obj.getNum());
        //通过成员方法间接访问 看new（Zi） //20

        System.out.println(obj.getNumFu());
        //通过成员方法间接访问 看new（Zi） Zi类中没有getNum2() 则向上找Fu //20

        //System.out.println(obj.getNumZi());  //编译看左边 运行看右边（成员方法）
    }
}
