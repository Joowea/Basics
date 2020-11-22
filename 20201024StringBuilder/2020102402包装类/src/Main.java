import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args){
        int i1 = 100;
        Integer i2 = new Integer(i1);
        System.out.println("i1="+i1+","+"i1类型：");
        System.out.println("i2="+i2+","+"i2类型：");


        Integer ii1 = 100;
        Integer ii2 = 100;
        Integer ii3 = 200;
        Integer ii4 = 200;

        Integer iii1 = valueOf(i1);

        System.out.println(ii1 == ii2);
        System.out.println(ii3 == ii4);
    }



}
