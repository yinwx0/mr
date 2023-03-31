package test;

import java.util.Arrays;
import java.util.Comparator;

public class yin37 {
    public static void main(String[] args) {
        int a[][]={{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){

                System.out.print(+a[i][j]);
            }
            System.out.println();
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {//表示二维数组
                return o1[0]!=o2[0]?o1[0]-o2[0]:o1[1]-o2[1];//设置比较行数

            }
        });
        System.out.println("排序后");
        showArray(a);
    }
    public static void showArray(int[][]a){
        for (int[ ]row :a){
            System.out.println(Arrays.toString(row));
        }

    }
}

