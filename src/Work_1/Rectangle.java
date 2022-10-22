package Work_1;

/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/4 21:27
 */
public class Rectangle {
    private double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculate(){
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(52.64,84.25);
        System.out.println("面积为:"+ r.calculate());
    }
}
