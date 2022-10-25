package Test7;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/25 8:18
 */
// 测试类
public class Test7_2 {
    public static void main(String[] args) {
        square sq = new square();
        circle ci = new circle();
        sq.area(5.2);
        sq.perimeter(6.4);
        ci.area(6.5);
        ci.perimeter(1.2);
    }
}
// 正方形类
class square implements area,perimeter{
    @Override
    public void area( double a){
        double temp = a*a;
        System.out.println("The area of the square is:\t"+temp);
    }
    @Override
    public void perimeter(double a) {
        double temp = a*4;
        System.out.println("The perimeter of the square is:\t"+temp);
    }
}
// 圆形类
class circle implements area,perimeter{

    @Override
    public void area(double r) {
        double temp = Math.PI*r*r;
        System.out.println("The area of the circle is:\t"+temp);
    }
    @Override
    public void perimeter(double r) {
        double temp = Math.PI*r*2;
        System.out.println("The perimeter of the circle is:\t"+temp);
    }
}
interface Shape {

}
interface area extends Shape{
    void area(double x);
}
interface perimeter extends Shape{
    void perimeter(double x);
}