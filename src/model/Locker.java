package model;

public class Locker {
    private String lockerID;
    private Customer assigned;
    private boolean isCleared;

    public Locker(String ID){
        this.lockerID = ID;
        this.assigned = null;
        this.isCleared = true;

    }

    public void assignLocker(Customer c) {
        if (assigned != null) {
            assigned.clearLockerNum(); //removes previous's customer designation to the locker
            this.assigned = c;
            this.isCleared = false;
        }
        if (assigned == null) {
            this.assigned = c;
            this.isCleared = false;
        }
    }

    public boolean isCleared(){
        return this.isCleared;
    }

    public String getLockerID(){
        return this.lockerID;
    }
}
