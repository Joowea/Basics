import java.util.ArrayList;

import static java.lang.Long.valueOf;

/*1. 装箱、拆箱
* 2. Integer类缓存区
* 3. == equals(obj)
* 4. 基本数据类型 引用数据类型 堆内存 栈内存
*/

public class comp {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;

        Long g = 3L;
        Long h = 2L;

        System.out.println(c==d); //T
        System.out.println(e==f); //F
        System.out.println(c==(a+b)); //T
        System.out.println(c.equals(a+b)); //
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
        System.out.println("+++++++++++++++++++++++++++++");

        System.out.println(g.equals(c));
        System.out.println(g==c.intValue());

        long ll1 = 3l;
        int ll2 = 3;
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(ll1==ll2);

    }
}
