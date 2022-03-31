package com.company.lesson6;

public class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }
    @Override
    public void Run(int run) {
        super.Run(run);
        if(run >= 0 && run <= 201) {
            System.out.println(this.name + "-" + "Могу пробежать ещё");
        } else if(run < 0) {
            System.out.println("Это не возможно!");
        }
        else {
            System.out.println(this.name + "-" + "Больше не могу!");
        }
    }

    public void setSail(Integer sail) {
        if(sail > 0) {
            System.out.println(this.name + "-" + "Плавать не умею");
        } else {
            System.out.println(this.name + "-" + "Я не могу это выполнить :(");
        }
    }
    @Override
    public void info() {
        super.info();
    }
}
