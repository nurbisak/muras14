package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    public void singing(){
        System.out.println(getName()+" is singing.");
    }
    public void playGuitar(){
        System.out.println(getName()+" is playing guitar.");
    }

    @Override
    public void learn() {
        super.learn();

    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
