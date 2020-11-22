package MultiClassCastInstanceof;

public class Main102905 {

    public static void main(String[] args) {

        Employee obj1 = new Teacher();
        Employee obj2 = new Assistant();

        obj1.workTime();
        obj2.workTime();

        System.out.println("________________");


        //lifeTime()
        if(obj1 instanceof Teacher){
            Teacher teacher = (Teacher)obj1;
            teacher.lifeTime();
        }

        if(obj2 instanceof Assistant){
            ((Assistant) obj2).lifeTime();
        }
    }
}
