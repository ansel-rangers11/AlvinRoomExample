package model;

import java.util.*;

public class Database {

    private List<Customer> customers;
    private List<Locker> lockers;
    private static Database instance;

    public Database() {
        this.customers = new ArrayList<>();
        this.lockers = new ArrayList<>();
    }

    public static Database getInstance() {
        // Do not modify the implementation of this method!
        if(instance == null) {
            instance = new Database();
        }

        return instance;
    }

    public void addCustomers(Customer c) {
        this.customers.add(c);
    }

    public void addLockers(Locker l) {
        this.lockers.add(l);
    }

    public List<Locker> getLockers() {
        return Collections.unmodifiableList(this.lockers);
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(this.customers);
    }

    public Set<Locker> getNotAvailableMenLockers() {
        Set<Locker> available = new HashSet<>();
        for (Locker next : lockers) {
            if (next.lockerLocation() == Room.MENS && next.lockerAssignment().toString() != "AVAILABLE FOR RENT") { //needed edit
                available.add(next);
            }
        }
        return available;
    }

    public Set<Locker> getNotAvailableWomenLockers() {
        Set<Locker> available = new HashSet<>();
        for (Locker next : lockers) {
            if (next.lockerLocation() == Room.WOMENS && next.lockerAssignment().toString() != "AVAILABLE FOR RENT") { //needed edit
                available.add(next);
            }
        }
        return available;
    }

    public Set<Locker> getNotAvailableUniversalLockers() {
        Set<Locker> available = new HashSet<>();
        for (Locker next : lockers) {
            if (next.lockerLocation() == Room.UNIVERSAL && next.lockerAssignment().toString() != "AVAILABLE FOR RENT") { //needed edit
                available.add(next);
            }
        }
        return available;
    }

    public Set<Integer> getLockerNums() {
        Set<Integer> lockernums = new HashSet<>();
        for (Locker l : lockers) {
            lockernums.add(l.getLockerNumber());
        }
        return lockernums;
    }

    public Set<Locker> getBrokenMenLockers() {
        Set<Locker> lockernums = new HashSet<>();
        for (Locker l : lockers) {
            if (l.lockerLocation() == Room.MENS && l.isLockerBroken()) {
                lockernums.add(l);
            }
        }
        return lockernums;
    }

    public Set<Locker> getBrokenWomenLockers() {
        Set<Locker> lockernums = new HashSet<>();
        for (Locker l : lockers) {
            if (l.lockerLocation() == Room.WOMENS && l.isLockerBroken()) {
                lockernums.add(l);
            }
        }
        return lockernums;
    }

    public Set<Locker> getBrokenUniversalLockers() {
        Set<Locker> lockernums = new HashSet<>();
        for (Locker l : lockers) {
            if (l.lockerLocation() == Room.UNIVERSAL && l.isLockerBroken()) {
                lockernums.add(l);
            }
        }
        return lockernums;
    }

}
