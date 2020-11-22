package InnerClass05HeroCase类和接口作成员变量;

public class Main103005 {
    public static void main(String[] args) {

        Hero hero = new Hero();

        hero.setName("伊利丹");
        hero.setAge(30);

        hero.setWeapon(new Weapon("埃辛诺斯战刃"));

        hero.attack2();

        System.out.println(hero.attack1());

        Skill skill = new RemoteSkill();

        hero.setSkill(skill);

        hero.skill();
    }
}
