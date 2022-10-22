package Test7;

import javax.swing.*;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/18 21:12
 */
public abstract class Animal {
    public String name;
    public abstract void makeNoice();
}
class Dog extends Animal {
    @Override
    public void makeNoice() {
        System.out.println("汪汪~");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoice();
    }
}