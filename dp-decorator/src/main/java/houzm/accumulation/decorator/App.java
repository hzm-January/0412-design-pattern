package houzm.accumulation.decorator;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 14:03
 * description:
 *
 * 装饰模式 ：
 * 动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更灵活
 * 装饰模式是子类的一种更灵活的替代方案，装饰器类实现与装饰目标相同的接口
 * 并使用聚合来"装饰"对目标的调用，使用装饰器模式可以在运行时更改类的行为
 *
 * 优点：装饰模式是继承的一种替代模式，可以动态扩展一个实现类的功能
 * 缺点：错层装饰比较复杂
 *
 * 本案例：
 * 装备：武器、护甲
 * 装备装饰者： 红宝石、蓝宝石、绿宝石
 *
 */
public class App {

    public static void main(String[] args) {
        Armor armor = new Armor();
        Equip equip = new GemRed(new GemBlue(new GemGreen(armor)));
        System.out.println(equip.attack());
        System.out.println(equip.description());
    }

}
