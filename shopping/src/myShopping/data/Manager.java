package myShopping.data;

//管理员信息

public class Manager {

    private String username = "manager";    //管理员名字
    private String password = "1234";       //管理员密码

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

