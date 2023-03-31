package y0309.newmoto;
public class _Bus extends _MotoVehicle{
    {
        super.getBrands().add("金杯 16座");
        super.getBrands().add("金杯 34座");
        super.getBrands().add("金龙 16座");
        super.getBrands().add("金龙 34座");
    }
    @Override
    public int calcRent(int days,int _No) {
        try {
            test(days,_No);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        switch (_No){
            case 4,6 -> {
                return 800 * days;
            }
            case 5,7 -> {
                return 1500 * days;
            }
            default -> {
                return 0;
            }
        }
    }
}
