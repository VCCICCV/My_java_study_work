package Test6;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/18 21:16
 */
public abstract class Area_Peri {
    // 计算面积
    public abstract double getArea();
    // 计算周长
    public abstract Double getPerimeter();

}
class Circle extends Area_Peri {
    private int m_radius = 10;
    @Override
        public double getArea() {
            return m_radius*m_radius*Math.PI;
        }

        @Override
        public Double getPerimeter() {
            return 2*m_radius*Math.PI;
        }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("面积:"+circle.getArea()+"\t周长:"+circle.getPerimeter());
    }
}
