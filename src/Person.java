/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/11 11:32
 */
public class Person {
    private String name;
    private int age;
    // 构造函数用来初始化
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("姓名:"+name+"\n年龄:"+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// class Test{
//     public static void main(String[] args) {
//         Person p = new Person("张三",25);
//         System.out.println("修改前: \n姓名:"+p.getName()+"\n年龄:"+p.getAge());
//         p.setName("李四");
//         p.setAge(14);
//         System.out.println("修改后: \n姓名:"+p.getName()+"\n年龄:"+p.getAge());
//     }
// }