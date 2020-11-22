package StringBuilder;
/*
 * 构造方法：1. 无参
 *          2. 有参
 *
 * 成员方法：1. public StringBuilder append(...):添加任意类型数据
 *          2. public String toString(...):StringBuilder转String*/

public class Main01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); //空参数构造

        StringBuilder sb2 = new StringBuilder("abc"); //带字符串的构造

        System.out.println("sb1:" + sb1);
        System.out.println("sb2:" + sb2);

        StringBuilder sb3 = sb1.append("abc");

        System.out.println(sb3 == sb1);
        System.out.println(sb3.equals(sb1));

        System.out.println("_______________________________");


        // 20201026 String
        String a = "12345iop";
        String b = "12345iop";
        String c = new String("12345iop");
        String d = new String("12345iop");
        String e = "12345" + "iop";
        String f = "12345IOP";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a == c);

        System.out.println(c == d);
        System.out.println("_______________________________");

        System.out.println(a == e);

        System.out.println(a == f);

        System.out.println(a.equalsIgnoreCase(f));
    }
}
