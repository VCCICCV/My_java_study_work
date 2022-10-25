package Test7;

/**
 * @Project_Name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/25 8:53
 */
public class Test7_4 {
    public static void main(String[] args) {
        Eater E;
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        E = new Dog();
        cat.eat();
        E.eat();
        E = new Cat();
        E.eat();
    }
}
class Dog implements Eater{
    @Override
    public void eat() {
        System.out.println("Dog eat~");
    }
}
class Cat implements Eater{
    @Override
    public void eat() {
        System.out.println("Cat eat~");
    }
}
interface Eater{
    void eat();
}
