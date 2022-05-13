package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String GroupName) {
        super(name, designation);
        this.groupName=GroupName;
    }
    public void dancing(){
        System.out.println(getName()+" is dancing.");
    }
    @Override
    public void learn() {
        super.learn();
    }
    @Override
    public void walk() {
        super.walk();
    }
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                "} " + super.toString();
    }
}
