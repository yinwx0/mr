package Per;

public  class SoftEngineer implements BizAgent,Programmer{
    String name;
    @Override
    public String getName(){
        return name;
    }
    public SoftEngineer(String name){
        this.name = name;
        System.out.println("我是一名软件工程师，我的名字叫" + getName());
        writeProgram();
        giveBizSpeech();
    }
    @Override
    public void writeProgram() {
        System.out.println("我会写代码。");
    }

    @Override
    public void giveBizSpeech() {
        System.out.println("我会讲业务。");
    }

}
