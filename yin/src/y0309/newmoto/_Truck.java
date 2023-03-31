package y0309.newmoto;
public class _Truck extends _MotoVehicle{
    {
        getBrands().add("10吨 卡车");
        getBrands().add("20吨 卡车");
    }
    @Override
    public int calcRent(int days,int _No) {
        try {
            test(days,_No);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        switch (_No){
            case 8 -> {
                return 1600 * days;
            }
            case 9 -> {
                return 2000 * days;
            }
        }
        return 0;
    }
}
