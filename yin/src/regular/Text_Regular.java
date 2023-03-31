package regular;

public class Text_Regular {

    public static void main(String[] args){
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("周长为：");
        System.out.println(polygon1.getPerimeter());
        System.out.println("面积为：");
        System.out.println(polygon1.getArea());
        System.out.println();

        RegularPolygon polygon2 = new RegularPolygon();
        polygon2.setN(6);
        polygon2.setSide(4);
        System.out.println("周长为：");
        System.out.println(polygon2.getPerimeter());
        System.out.println("面积为：");
        System.out.println(polygon2.getArea());
        System.out.println();

        RegularPolygon polygon3 = new RegularPolygon();
        polygon3.setN(10);
        polygon3.setSide(4);
        polygon3.setX(5.6);
        polygon3.setY(7.8);
        System.out.println("周长为：");
        System.out.println(polygon3.getPerimeter());
        System.out.println("面积为：");
        System.out.println(polygon3.getArea());





    }
}
