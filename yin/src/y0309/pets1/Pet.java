package y0309.pets1;

/**
 * 宠物类，狗狗和企鹅的父类。
 * 
 */
public abstract class Pet {
	private String name = "无名氏";// 昵称
	private Integer health = 100;// 健康值
	private int love = 0;        // 亲密度
	/**
	 * 无参构造方法。
	 */
	public Pet() {
		this.health = 95;
		System.out.println("执行宠物的无参构造方法。");
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	public abstract void eat();
	/**
	 * 有参构造方法。
	 * @param name  昵称
	 */
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	/**
	 * 输出宠物信息。
	 */
	public abstract void print();
	/*宠物生病处理*/
	public abstract void cure();
}