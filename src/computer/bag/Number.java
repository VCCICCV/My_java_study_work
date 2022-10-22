package computer.bag;

/**
 * Number类
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/11 11:48
 */

public class Number {
    private int n1, n2;

    // 构造方法
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // 加
    public double addition() {
        return n1 + n2;
    }

    // 减
    public double subtraction() {
        return n1 - n2;
    }

    // 乘
    public double multiplication() {
        return n1 * n2;
    }

    // 除法
    public double division() {
        return n1 / n2;
    }

    // getter setter
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}

