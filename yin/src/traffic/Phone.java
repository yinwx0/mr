package traffic;

import java.util.Random;

public class Phone implements Gps{       //仪器类


    @Override
    public String position() {
        return new Random().nextInt(1000) + "," + new Random().nextInt(1000);
    }
}
