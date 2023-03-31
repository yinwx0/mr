package y0309.pets1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class PetTest {
    static Pet pet=new Dog("欧拉","牧羊犬");
   static Pet pet01=new Penguin("扣扣","扣仔");

//    public static void main(String[] args) {
//        //    对象的向上转型
//        Pet pet=new Dog("欧拉","牧羊犬");
//        ((Dog)pet).playWithDis();
//        Pet pet01=new Penguin("扣扣","扣仔");
//        //((Dog)pet01).playWithDis();
//        pet.print();
//    }


    public static void main(String[] args) {
        System.out.println("欢迎您来到宠物店!");
        System.out.print("请选择要领养的宠物类型：(1.狗狗 2.企鹅)");
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        switch (a){
            case 1-> {

                if(pet instanceof Dog dog){
                    System.out.println("领养成功!");
                    dog.print();
                    dog.eat();
                    dog.playWithDis();
                    dog.print();
                }
            }
            case 2-> {
                if(pet01 instanceof Penguin){
                    System.out.println("领养成功!");
                    pet01.print();
                    ((Penguin)pet01).eat();
                    ((Penguin) pet01).swimming();
                    pet01.print();
                }
            }
            default -> { }
        }
    }
}