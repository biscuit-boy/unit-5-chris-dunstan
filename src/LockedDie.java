public class LockedDie implements Lockable{
    private int value = 0;
    private boolean locked;
    private int key = 0;

    public LockedDie(){
        roll();
        locked = false;
    }

    public void roll(){
        if (!locked)
            value = (int) (6*Math.random()) + 1;
    }

    public int getValue(){
        if (!locked)
            return value;
        else
            return 7;
    }

    public void setValue(int x){
        if (!locked)
            value = x;
    }

    public String toString(){
        if (!locked)
            return "" + value;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void lock(int key){
        if (this.key == key)
            locked = true;
    }

    public void unlock(int key ){
        if (this.key == key)
            locked = false;
    }

    public boolean isLocked(){
        return locked;
    }
}
