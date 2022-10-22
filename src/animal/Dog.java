package animal;

/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/11 11:42
 */
public class Dog {
    private String name;
    // getter和setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("diudiu");
        System.out.println("Dog name："+d.getName());
    }
}