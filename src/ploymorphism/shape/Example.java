package ploymorphism.shape;
class Animal{
	public void cry() {}
}
class Dog extends Animal{
	public void cry() {
		System.out.println("汪汪…………");
	}
}
class Cat extends Animal{
	public void cry() {
		System.out.println("喵瞄…………");
	}
}
public class Example {
    public static void main(String[] args) {
    	Animal a;
    	a=new Dog();
    	a.cry();
    	a=new Cat();
    	a.cry();
    }
}
