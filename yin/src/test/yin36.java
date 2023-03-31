package test;


public class yin36 {

        public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        test1(a);
        test2(a);
        test3(a);
    }
        private static void test1(int[][] a) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
        private static void test2(int[][] a) {
        int min = 100;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("min:"+min);
    }
        private static void test3(int[][] a) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
    }
