package y0309.shape;

public class Test {

    public static void main(String[] args) {
        Shape rectangle=new Rectangle(2,3);
        rectangle.area();
        Shape triangle=new Triangle(4,5);
        triangle.area();

        Rectangle rectangle1=(Rectangle) rectangle;
        rectangle1.area();
        Triangle triangle1=(Triangle) triangle;
        triangle1.area();

        Cube cube=new Cube(2,3,4);
        cube.volume();
    }
}
