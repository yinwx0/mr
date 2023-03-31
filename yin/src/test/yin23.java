package test;

public class yin23 {
    public static void main(String[] args) {
        for (int n =1; n <= 999999; n++ ){

            int count = 0;
            int tmp = n;

            while (tmp != 0){
                count++;
                tmp = tmp/10;
            }

            tmp = n;

            int sum = 0;
            while (tmp != 0 ) {

                sum += Math.pow(tmp%10,count);

                tmp = tmp/10;
            }


            if(sum == n && count==4)
                System.out.println(sum+"siye");
            if(sum == n && count==5)
                System.out.println(sum+"wujiao");


        }
    }

}
