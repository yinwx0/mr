package vis;

import java.util.Scanner;

public class VistorTest {
    public static void main(String[] args) {
        Vistor vistor = new Vistor();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scan.next();
        System.out.println("请输入年龄：");
        int age = scan.nextInt();
        vistor.setName(name);
        vistor.setAge(age);
        vistor.print();
    }
}
