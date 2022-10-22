package ploymorphism.shape;

import java.util.Random;

/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/10 21:16
 */
public class Work {
    public static class RandomShapeGenerator {
        // 随机种为47
        private Random rand = new Random(47);

        public Shapes next() {
            //生成123
            switch (rand.nextInt(3)) {
                default:
                case 1:
                    return new Circle();
                case 2:
                    return new Square();
                case 3:
                    return new Triangle();
            }
        }
    }

    // 抽象形状Shapes，implements实现一个接口，必须实现接口中的所有方法
    public abstract static class Shapes implements Shape {

        private static RandomShapeGenerator gen = new RandomShapeGenerator();

        public static void main(String[] args) {
            Shapes[] s = new Shapes[9];
            for (int i = 0; i < s.length; i++)
                s[i] = gen.next();
            for (Shapes shp : s)
                shp.draw();
        }
    }

    //定义个接口及方法
    public interface Shape {
        void draw();

        void erase();
    }

    // 实现方法:行为,正方形
    public static class Square extends Shapes {
        @Override // 告诉编译器检查这个方法，保证父类要包含一个被该方法重写的方法
        public void draw() {
            System.out.println("Square.draw()");
        }

        @Override
        public void erase() {
            System.out.println("Square.erase()");
        }
    }

    // 三角形
    public static class Triangle extends Shapes {
        @Override
        public void draw() {
            System.out.println("Triangle.draw()");
        }

        @Override
        public void erase() {
            System.out.println("Triangle.erase()");
        }
    }

    // 圆形
    public static class Circle extends Shapes {
        @Override
        public void draw() {
            System.out.println("Circle.draw()");
        }

        @Override
        public void erase() {
            System.out.println("Circle.erase()");
        }
    }
}
