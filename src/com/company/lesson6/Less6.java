package com.company.lesson6;

public class Less6 {
    public static void main(String[] args){
        Dog dog = new Dog("Элла", "бежевый");
        Dog dog1 = new Dog("Марат", "черный");
        Dog dog2 = new Dog("Алина", "чёрный");

        Cat cat = new Cat("Робин","цветной");
        Cat cat1 = new Cat("Персик", "золотой");
        Cat cat2 = new Cat("Фин", "белый");

        dog.info();
        dog.Sail(-1);
        dog.Sail(5);
        dog2.Sail(15);
        dog1.Run(-1);
        dog1.Run(250);
        dog1.Run(501);
        cat2.info();
        cat1.Run(-1);
        cat.Run(100);
        cat.Run(0);
        cat2.setSail(2);

        System.out.println(Animal.counter());

    }

}
