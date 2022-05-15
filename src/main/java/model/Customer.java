package model;
public class Customer {
    private int sqlID;
    private long natID;
    private String name;
    public Customer(long n){
        natID = n;
    }
    public Customer(long nid, String n){
        natID = nid;
        name = n;
    }
    public Customer(long nid, int i, String n){
        natID = nid;
        name = n;
        sqlID = i;
    }
    public long getNatID() {
        return natID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSqlID() {
        return sqlID;
    }
    public void setSqlID(int sqlID) {
        this.sqlID = sqlID;
    }
}