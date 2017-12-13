package model;

public class Customer {
    private String name;
    private String lockernum;


    public Customer(String givenname){
        this.name = givenname;
        this.lockernum = null;
    }

    public void setLockerNum(String assigned){
        this.lockernum = assigned;
    }

    public void clearLockerNum(){
        this.lockernum = null;
    }

    public String getName(){
        return this.name;
    }

    public String getLockerNumOfCustomer(){
        if (this.lockernum == null){
            return null;
        }
        else {
            return this.name;
        }
    }



}
