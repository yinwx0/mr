package easyshopsystem.data;

import static easyshopsystem.data.Customer.setCustInfo;
import static easyshopsystem.data.Customer.setCustomer;
import static easyshopsystem.data.Goods.setGOODS;
import static easyshopsystem.data.Manager.setManager;

public final class Data {
    public static void init() {
        setManager("manager", "1234");
        setCustomer("manager", "1234");
        setCustomer("1900", "1900");
        setCustomer("1711", "1711");
        setCustomer("1623", "1623");
        setCustomer("1545", "1545");
        setCustomer("1464", "1464");
        setCustomer("1372", "1372");
        setCustomer("1286", "1286");
        setCustInfo("1900", new String[]{"08/05", "2000"});
        setCustInfo("1711", new String[]{"07/03", "4000"});
        setCustInfo("1623", new String[]{"06/26", "5000"});
        setCustInfo("1545", new String[]{"04/08", "2200"});
        setCustInfo("1464", new String[]{"08/16", "1000"});
        setCustInfo("1372", new String[]{"12/23", "3000"});
        setCustInfo("1286", new String[]{"12/21", "10080"});
        setGOODS(1, new String[]{"addidas 运动鞋", "420.78"});
        setGOODS(2, new String[]{"Kappa 网球裙", "200"});
        setGOODS(3, new String[]{"网球拍", "780"});
        setGOODS(4, new String[]{"addidas T恤", "880"});
        setGOODS(5, new String[]{"Nike 运动鞋", "900"});
        setGOODS(6, new String[]{"Kappa 网球", "45"});
        setGOODS(7, new String[]{"Kappa T恤", "245"});
    }
    public enum DATA{
        SA("""
            Welcome to SMS!
            ----------------
            1.客 户 登 陆
            2.管 理 员 登 陆
            3.退 出
            ----------------
            请选择:"""),CH("""
            -------------
            1.购 物 结 算
            2.真 情 回 馈
            3.注 销
            -------------
            请选择:"""),MNH("""
            --------------
            1.信 息 管 理
            --------------
            请选择,按'n'返回:"""),CIM("""
            ------------------------
            1.显 示 所 有 会 员 信 息
            2.显 示 所 有 商 品 信 息
            3.添 加 会 员 信 息
            4.添 加 商 品 信 息
            5.修 改 会 员 信 息
            6.修 改 商 品 信 息
            7.查 询 会 员 信 息
            8.查 询 商 品 信 息
            9.跳 转 到 源 码
            ------------------------
            请选择,按'n'返回:"""),TT("""
            会员号     生日     积分
            -------|-------|-------|"""),FN("""
            ----------------
            1.幸 运 大 放 送
            2.幸 运 抽 奖
            3.生 日 问 候
            ----------------
            请选择,按'n'返回:"""),LI("""
            -------------------消费清单-------------------
                   物品      单价      个数     金额"""),MDF("""
            -------------------
            1.修 改 会 员 生 日
            2.修 改 会 员 积 分
             -------------------
            请选择:"""),MGD("""
            -------------------
            1.修 改 商 品 名 称
            2.修 改 商 品 单 价
             -------------------
            请选择,按'n'返回:"""),LN("-----------------------------"),
        URL("https://gitee.com/zhai-jinpei/javaseconsole"),
        CN("用户(4位数)/管理员:"),MN("管理员名:"), CNO("会员号:"), BI("生日(月/日<2位>):"),C("会员"),
        SC("积分"),P("价格:"),GNM("名称:"), GN("编号:"), PW("密码:"),BA("按'n'返回:"),
        DN("done!"), ER("error!"), EX("exit!"),WR("wrong!"),NO("none!");
        private final String name;
        DATA(String name){
            this.name = name;
        }
        public static String g(DATA data) {
            return data.name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
}
