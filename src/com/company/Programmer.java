package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }


    public void coding(){
        System.out.println(getName()+" is coding.");
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
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}

