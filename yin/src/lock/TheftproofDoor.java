package lock;

public class TheftproofDoor extends Door implements Door.Lock, Door.DoorBell {

    @Override
    public void open() {
        System.out.println("用力推，门打开了。");
    }

    @Override
    public void close() {
        System.out.println("轻轻拉门，门关上了。");
    }

    @Override
    public void lockUp() {
        System.out.println("插上钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。");
    }

    @Override
    public void openLock() {
        System.out.println("插上钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。");
    }

    @Override
    public void doorbell() {
        System.out.println("铃......咔擦......照片已存储");
    }
}
