package entity;
public class Customer {
    private long natID;
    private String name;
    public Customer(){}
    public Customer(long natID){
        this.natID = natID;
    }
    public Customer(int natID, String n){
        this.natID = natID;
        name = n;
    }
    public long getNatID() {
        return natID;
    }
    public void setNatID(long natID) {
        this.natID = natID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}