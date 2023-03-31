package shape;

import shape.Triangle;

public class ShapePrint {
    static Rectangle R1 = new Rectangle();
    static Triangle T1 = new Triangle(2);

    public static void main(String[] args) {

        System.out.println(R1.toString() + "\n" + T1.toString());

    }
}
