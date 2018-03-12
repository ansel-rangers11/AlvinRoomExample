package model;

public class Customer {
    private String name;
    private Integer lockernum;
    private double acctcredit;
    private Integer phonenum;

    public Customer(String name) {
        this.name = name;
        this.lockernum = null;
        this.acctcredit = 100.00;
        this.phonenum = 00000;
    }

    public void setLockerNum(Integer num) {
        this.lockernum = num;
    }

    public void setPhoneNum(Integer phonenum){
        this.phonenum = phonenum;
    }

    public void clearLockerNum() {
        this.lockernum = null;
    }

    public String getName() {
        return this.name;
    }

    public Integer getLockerNumOfCustomer() {
        if (this.lockernum == null) {
            return null;
        } else {
            return this.lockernum;
        }
    }

    public Integer getPhoneNum(){
        if (this.phonenum == null){
            return 00000;
        }
        return this.phonenum;
    }

    public void addCredit(double c) {
        this.acctcredit += c;
    }




}
