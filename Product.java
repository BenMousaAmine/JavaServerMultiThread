package org.example;

public class Product {
    int id ;
    String  descr ;
    double cost ;

    public Product(int id, String descr, double cost) {
        this.setId(id);
        this.setCost(cost);
        this.setDescr(descr);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
