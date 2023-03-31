package pet;

import java.util.Scanner;

public class PetShopDemo {
    public static void main(String[] args) {
        PetShop ps = new PetShop(5);       //五个宠物
        ps.pets[0] = new Cat("cat1","blue",1);
        ps.pets[1] = new Cat("cat2","white",2);
        ps.pets[2] = new Cat("cat3","black",3);
        ps.pets[3] = new Dog("dog1","blue",1);
        ps.pets[4] = new Dog("dog2","black",2);
        System.out.println("put keywords:");
        String k = new Scanner(System.in).next();
        print(ps.search(k));

    }
    public static void print(Pet[] p){         //输出操作
        for (int i = 0;i < p.length;++i) {
            if (p[i] == null) continue;
            System.out.println(p[i].getName() + "\t" + p[i].getColor() + "\t" + p[i].getAge());
        }
    }
}
