package org.fasttrackit;

public class Dog extends Animal {

    private String collarcolor;
    private boolean collar;

    public void happiness() {
        System.out.println(getName() + " a dat din coada de fericire");
    }

    public Dog()
    {
        this.collarcolor = collarcolor;
        this.collar = collar;
    }

    public String getCollarcolor() {
        return collarcolor;
    }

    public void setCollarcolor(String collarcolor) {
        this.collarcolor = collarcolor;
    }

    public boolean isCollar() {
        return collar;
    }

    public void setCollar(boolean collar) {
        this.collar = collar;
    }
}
