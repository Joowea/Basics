package MultiClassCastInstanceof;

public class Teacher extends Employee {
    @Override
    public void workTime() {
        System.out.println("老师讲课");
    }

    public void lifeTime(){
        System.out.println("老师看书");
    }
}
