package model;

public class Locker {
    private Integer lockerNumber;
    private Customer assigned;
    private boolean isCleared;
    private int daysLeftInAgreement;
    private Room r;
    private Integer combo;
    private Boolean broken;

    public static final double ONEMONTH = 25.00;
    public static final double FOURMONTH = 80.00;
    public static final double ONEYEAR = 200.00;

    public Locker(Integer ID, Room room, Integer lockcombo) {
        this.lockerNumber = ID;
        this.assigned = null;
        this.isCleared = true;
        this.r = room;
        this.combo = lockcombo;
        this.broken = false;
    }

    public Room lockerLocation(){
        return this.r;
    }

    public void assignLocker(Customer c, int months) {
        if (this.assigned != null ) {
            assigned.clearLockerNum(); //removes previous's customer designation to the locker
            this.assigned = c;
            this.isCleared = false;
        }
        if (assigned == null) {
            this.assigned = c;
            this.isCleared = false;

        }
    }

    public void setBroken(){
        this.broken = true;
    }

    public boolean isLockerBroken(){
        return this.broken;
    }

    public String lockerAssignment(){
        if (this.assigned == null){
            return "AVAILABLE FOR RENT";
        } else {
            return this.assigned.getName();
        }
    }

    public Integer helperFunctionCustomer(){  //to access the phone number and evade nullPointer
        if(this.assigned == null){
            return 00000;
        } else {
            return this.assigned.getPhoneNum();
        }

    }

    public Integer getCombo() {
        if (this.combo == null) {
            return null;
        }
        else {return this.combo;
        }
    }

    public boolean isCleared() {
        return this.isCleared;
    }

    public Integer getLockerNumber() {
        if (this.lockerNumber != null) {
            return this.lockerNumber;
        }
        else {
            return null;
        }
    }

    public String isBroken() {
        if(this.broken == true){
            return "BROKEN";
        } else {
            return "Functional";
        }
    }


}
