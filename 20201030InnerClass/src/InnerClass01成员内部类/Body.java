package InnerClass01成员内部类;

public class Body { //外部类Body

    private String stringBody = "身体"; //外部类成员变量

    public String getStringBody() {
        return stringBody;
    }


    public void methodBody() { //外部类成员方法

        System.out.print("methodBody in outer class,");

        //System.out.println("My inner class heart is:" + stringHeart + methodHeartBeat());  //X
        //外部类不能直接访问内部类成员变量 和成员方法

        System.out.println("and my inner class heart is:" + new Heart().stringHeart);
        //外部类访问内部类成员变量 须使用内部类对象
    }

    public void methodGettingInformationFromHeart() { //外部类成员方法

        System.out.println("methodGettingInformationFromHeart in outer class " +
                "whose information from inner class is:\"" + new Heart().methodHeartBeat()+"\"");
        //外部类成员方法 访问内部类成员方法 须使用内部类对象
    }


    public class Heart { //内部类Heart

        private String stringHeart = "心脏"; //内部类成员变量

        public String methodHeartBeat() { //内部类成员方法 内部类可以自由访问外部类的成员变量 和方法

            return (new StringBuilder("MethodHeartBeat in inner class,")
                    .append("and my outer class is:").append(stringBody)).toString();

        }


    }
}
