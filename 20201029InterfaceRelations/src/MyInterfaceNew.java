/*
* new接口中共有五个方法
* 1. methodA 来自接口A
* 2. methodB 来自接口B
* 3. methodCommon 来自接口A和接口B (抽象方法不存在冲突)
* 4. methodNew 来自new接口自身
* 5. 自身重写的methodDefaultCommon
*
* 注意事项
* 1. 多个父接口中的抽象方法重复 没关系
* 2. 多个父接口中的默认方法重复 有关系 须重写 须带着default关键字*/

public interface MyInterfaceNew extends MyInterfaceA, MyInterfaceB {

    void methodNew();

    default void methodDefaultCommon(){
        System.out.println("override methodDefaultCommon in interfaceNew");
    }
}
