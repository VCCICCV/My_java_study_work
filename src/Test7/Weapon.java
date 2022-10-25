package Test7;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/25 8:03
 */
public class Weapon {
    private double cost;
}
class Tank extends Weapon implements Movable,Attacker{
    @Override
    public void move() {
        System.out.println("移动~");
    }

    @Override
    public void attack() {
        System.out.println("攻击！");

    }
}
class Test7_1{
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.move();
        tank.attack();
    }
}
interface Movable{
    void move();
}
interface Attacker{
    void attack();
}