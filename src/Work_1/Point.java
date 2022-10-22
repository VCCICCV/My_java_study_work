package Work_1; /**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/4 13:14
 */
/**创建公共的Point类*/
public class Point {
    // 定义一个公共的整形变量x
    public int x;
    // 定义一个公共的整形变量y
    public int y;
    /**Point类两个参数构造方法,初始化对象*/
    public Point(int x, int y) {
        // new对象时赋值
        this.x = x;
        // new对象时赋值
        this.y = y;
    }
    /**Point类单参数构造方法，初始化对象*/
    public Point(int x){
        // x,y轴数值相同，坐标轴对角线上的点
        this(x,x);
    }
    /**调用distance(int x, int y)返回距离原点的距离*/
    public double distance(){
        // 调用distance(int x, int y)
        return this.distance(0,0);
    }
    /**计算当前点到一个（x,y）坐标的距离**/
    public double distance(int x, int y){
        // 返回距离：取平方根的结果
        return Math.sqrt((this.x - x)*(this.x - x)+(this.y - y)*(this.y - y));
    }
    /**计算当前点到一个点p的距离*/
    public double distance(Point p){
        // 调用distance(int x, int y)并返回值
        return this.distance(p.x,p.y);
    }


}
class Test {
    public static void main(String[] args) {
        // 实例Point对象
        Point p1 = new Point(0, 10);
        // 实例Point对象
        Point p2 = new Point(10);
        // 输出结果p1距离原点距离，p2距离原点距离
        System.out.println("p1距离原点距离:" + p1.distance() + "\np2距离原点距离:" + p2.distance());
        // 输出结果
        System.out.println("p1→p2距离:"+p1.distance(p2));
    }
}

/**
 * 构造方法用来初始化对象
 * 没有定义构造器，则编译器会自动定义一个无参的构造函数
 * 构造方法名要与类名相同,重载时参数列表必须不同,无返回值
 * */
/**
 * 方法重载：
 * 方法名称必须相同
 * 参数列表必须不同
 * 法的返回类型可以相同也可以不相同
 * */
