package Test6;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/18 20:39
 */
public class Person {
    int age;
    String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
class Student extends Person {
    private int studentID;

    public Student(int age, String name, int studentID) {
        super(age, name);
        this.studentID = studentID;
    }
    public void printinfo(){
        System.out.println("信息:\n"+"学号："+studentID+"\t姓名："+super.name+"\t年龄："+super.age);
    }
}
class Test{
    public static void main(String[] args) {
        Student student = new Student(12,"Student",20212077);
        student.printinfo();
    }
}