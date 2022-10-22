package work_7;

/**
 * 37. 定义一个类 Secret，其中有一个私有成员变量 s（String），值为”我是一个秘密”。定义一个包含 main 方法的测试类 TestSecret，实例化一个 Secret 对象并输出它的 s。
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/18 1:19
 */
public class Secret {
        private String s = "我是一个秘密";

    public String getS() {
        return s;
    }
}
class TestSecret{
    public static void main(String[] args) {
        Secret s = new Secret();
        System.out.println(s.getS());
    }
}
