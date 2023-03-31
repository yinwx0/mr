package data;

public class Gift {

        public Gift() {
        }

        /*
         * 根据礼物对象的变量返回礼物的全部信息
         */
        public String toString() {
            return (new StringBuilder()).append("一个价值￥").append(price)
                    .append("的").append(name).toString();
        }

        public String name ;	// 礼物名字
        public double price;	// 礼物价格
    }
