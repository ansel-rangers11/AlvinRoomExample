package model;

public enum Room {
    MENS(100), WOMENS(100), UNIVERSAL(200);

    private final int capacity;

    Room(int capacity){
        this.capacity = capacity;

    }

    public int getCapacity(){
        return this.capacity;
    }


}
