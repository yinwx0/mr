package y0309.newmoto;
public class _Car extends _MotoVehicle{
    {
        super.getBrands().add("宝马550i");
        super.getBrands().add("别克林荫大道");
        super.getBrands().add("别克商务舱GL8");
    }
    @Override
    public int calcRent(int days,int _No) {
        try {
            test(days,_No);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        switch (_No){
            case 1 -> {
                return  300 * days;
            }
            case 2 -> {
                return  500 * days;
            }
            case 3 -> {
                return  600 * days;
            }
            default -> {
                return 0;
            }
        }
    }
}
