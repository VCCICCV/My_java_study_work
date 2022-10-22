package test.bag;

import computer.bag.Number;

/**
 * TestNumber类
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/11 11:49
 */
public class TestNumber {
    public static void main(String[] args) {
        Number number = new Number(1, 2);
        System.out.println("成员:n1=" + number.getN1() + "\tn2=" + number.getN2());
        System.out.println("加运算:" + number.addition());
        System.out.println("减运算:" + number.subtraction());
        System.out.println("乘运算:" + number.multiplication());
        System.out.println("除运算:" + number.division());
    }

}
