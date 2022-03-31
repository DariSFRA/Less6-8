package com.company.lesson6;

public class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color);
    }
    @Override
    public Integer getSail() {
        return sail;
    }
    public void setSail(Integer sail) {
//        this.sail = sail;
        if (sail >= 10) {
            System.out.println(this.name + "-" + "Сейчас утону!");
        } if (sail < 0) {
            System.out.println(this.name + "-" + "Я не могу так сделать");
        } else {
            System.out.println(this.name + "-" + "Плавать не хочу");
        }
    }
    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
        if(run > 500) System.out.println(this.name + "-" + "Сегодня много уже пробежал");
        else System.out.println(this.name + "Побегать");
    }
    @Override
    public void Sail(int sail) {
        if(sail > 0 && sail <= 10 ) {
            System.out.println(this.name + "-" + "Можно и поплавать");
        } else {
            System.out.println(this.name + "-" + "Больше непоплыву!");
        }

    }
    @Override
    public void Run(int run) {
        super.Run(run);
        if(run >= 0 && run < 500) {
            System.out.println(this.name + "-" + "Могу пробежать ещё");
        } else  if(run<0) {
            System.out.println("Это не возможно!");
        }
        System.out.println(this.name + "-" + "Больше нет сил");
    }
    @Override
    public void info() {
        super.info();
    }

}
