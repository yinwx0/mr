package traffic;

import pet.Cat;

import javax.naming.Name;

public class Express {      //快递任务类

    String tracknumber;      // 快递单号
    double weight;           // 货物重量

    public Express(String tracknumber, double weight) {
        this.tracknumber = tracknumber;
        this.weight = weight;
    }

    public void before(){
        System.out.println("订单开始处理，仓库验货中。。。");
        System.out.println("货物重量：" + weight + "kg");
        System.out.println("货物检验完毕！");
        System.out.println("货物填装完毕！");
        System.out.println("运货人已通知！");
        System.out.println("快递单号："+tracknumber);
    }

    public void middle(String name,int number,String type){
        System.out.println("运货人"+ name + "正在驾驶编号为" + number + "的" + type + "发送货物！");
        System.out.println("运输进行中。。。");
        System.out.println("货物当前的坐标为:" + new Phone().position());
    }

    public void behind(String name,int number,String type){
        System.out.println("货物运输任务已完成！");
        System.out.println("运货人"+ name + "所驾驶的编号为" + number + "的" + type + "已归还！");
    }
}
