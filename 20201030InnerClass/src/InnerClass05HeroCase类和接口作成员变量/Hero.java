package InnerClass05HeroCase类和接口作成员变量;

public class Hero {

    private String name; //英雄名字

    private int age; //英雄年龄

    private Weapon weapon; //英雄武器

    private Skill skill; //英雄技能


    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String attack1() {
        return (new StringBuilder("年龄为[").append(age).append("]岁的[").append(name)
                .append("]英雄，手持武器[").append(weapon.getCode()).append("]攻击敌人")).toString();
    }

    public void attack2(){
        System.out.println("年龄为["+age+"]岁的英雄["+name+"]，" +
                "手持武器["+weapon.getCode()+"]攻击敌人");
    }

    public void skill(){

        skill.useSkill();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

}
