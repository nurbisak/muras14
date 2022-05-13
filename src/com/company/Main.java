package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer =new Programmer("Altyn","CEO","CodeOnline");
        Dancer dancer=new Dancer("Atai","Founder","KgDancers");
        Singer singer= new Singer("Gulnur","SingleSinger","Kyrghyz national music");
        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);
        programmer.coding();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        singer.eat();
        singer.singing();
        singer.learn();
        singer.playGuitar();
        singer.walk();



    }
}
