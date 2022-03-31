package com.company.lesson6;

public class Animal {
    protected String name;
    protected String color;
    protected Integer sail;
    protected Integer run;
    protected static int numb;

    public void Animal(){
    }
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        numb++;
    }
    public Integer getSail() {
        return sail;
    }
    public void setSail(Integer sail) {
        this.sail = sail;
    }
    public Integer getRun() {
        return run;
    }
    public void setRun(Integer run) {
        this.run = run;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static void numb() {
        numb = 0;
        numb++;
        System.out.println(numb);
    }
    public void Run( int run) {
        System.out.println(this.name + "-" + "Побежал" + " " + run);
    }
    public void Sail(int sail) {
        System.out.println(this.name + "-" + "Проплыл" + " " + sail);
    }
    public void info() {
        System.out.println(name + " " + color);
    }
    public static int counter() {
        int numb = Animal.numb;
        return numb;
    }


}
