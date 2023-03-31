package y0309.newmoto;
import java.util.ArrayList;
public abstract class _MotoVehicle {
    private static final ArrayList<Integer> MotoRentRecords = new ArrayList<>();
    private static final ArrayList<String> Brands = new ArrayList<>();
    public ArrayList<Integer> getMotoRentRecords(){
        return MotoRentRecords;
    }
    public ArrayList<String> getBrands(){
        return Brands;
    }
    public void toBrands(){
        for (int i = 0; i < Brands.size();++i) {
            System.out.println(i + 1 + "\t" + Brands.get(i));
        }
    }
    public abstract int calcRent(int days,int _No) ;
    public void test(int days,int _No)  {
        if (days <= 0||_No <= 0){
            throw new IllegalArgumentException("天数和序号不能为负数或0");
            }
        }
    public void allRent(){
        int all = 0;
        for (Integer integer:getMotoRentRecords()){
            all += integer;
        }
        System.out.println("总租金为: " + all);
    }
}
