package y0309.moto1;

/**
 * @author
 * @version 1.0
 * @data 2023/3/2 13:57
 */
public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public int calcTotalRent(MotoVehicle[] motos, int days) {
        int sum = 0;
        for (int i = 0; i < motos.length; i++) {
            sum += motos[i].calRent(days);
        }
        return sum;
    }
}

