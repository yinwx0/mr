package lock;

public abstract class Door {

    public abstract void open();

    public abstract void close();

    interface Lock{
        void lockUp();

        void openLock();
    }

    interface DoorBell{
        void doorbell();
    }


}
