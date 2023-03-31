package test;

public class yin33 {
    public static void main(String[] args) {
        //定义一个四行矩阵
        int[][]a = new int[4][4];
        for (int i = 0; i<4;i++){
            for (int j = 0; j<4;j++){
                a[i][j]=(int) (Math.random()*2);
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int largestrow =0;
        int countrow   =0;
        int temprow    =0;
        for (int i = 0; i < 4; i++){
            temprow =0;
            for (int j = 0; j < 4; j++){
                if (a[i][j]==1){
                    ++temprow;
                }
            }
            if (countrow<temprow){
                countrow=temprow;
                largestrow=i;
            }
        }
        int largestcolumn=0;
        int countcolumn=0;
        int tempcolumn=0;
        for (int j = 0; j<4;j++){
            tempcolumn=0;
            for (int i = 0; i<4;i++){
                if (a[i][j]==1){
                    ++tempcolumn;
                }
            }
            if (countcolumn<tempcolumn){
                countcolumn=tempcolumn;
                largestcolumn=j;
            }
        }
        System.out.println("the largest row index:"+largestrow);
        System.out.println("the largest column index:"+largestcolumn);
    }
}
