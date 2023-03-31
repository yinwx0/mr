package lock;

public class DoorTest {
    public static void main(String[] args) {
        TheftproofDoor door=new TheftproofDoor();
        door.close();
        door.lockUp();
        door.doorbell();
        door.openLock();
        door.open();
    }
}
