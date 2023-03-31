package y0309.moto1;

/**
 * @author
 * @version 1.0
 * @data 2023/3/2 13:57
 */
public class TestRent {
    public static void main(String[] args) {
        int days = 5; //租赁天数
        int totalRent;// 总租赁费用
        //客户租用的多辆汽车信息及租用天数
        MotoVehicle[] motos = new MotoVehicle[4];
        motos[0] = new Car("京NY28588", "宝马550i");
        motos[1] = new Car("京NNN328", "宝马550i");
        motos[2] = new Car("京NY28588", "别克林荫大道");
        motos[3] = new Bus("", "金龙", 34);
        //2、计算总租赁费用
        Customer customer = new Customer("张三");
        totalRent = customer.calcTotalRent(motos, days);
        // 输出客户姓名和总租赁费用
        System.out.println("汽车牌号" + "\t\t" + "汽车品牌");
        for (int i = 0; i < motos.length; i++) {
            if (i < 3) {
                System.out.println(motos[i].getNo() + "\t" + motos[i].getType());
            } else {
                System.out.println(motos[i].getNo() + "\t" + motos[i].getBrand());
            }
        }
        System.out.println("客户名：" + customer.name + ",租赁天数：" +
                days + "天，租赁费用：" + totalRent + "元。");
    }
}
