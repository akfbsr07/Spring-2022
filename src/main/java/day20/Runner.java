package day20;

import day21.Bird;
import day21.Cat;
import day21.Dog;

public class Runner {

    //Private class members can not be inherited by child classes from parent class(Impossible to inherited)
    //Public class members can be inherited(Always can be inherited)
    //Protected class members can be inherited(Always can be inherited)
    //Default class members can not be inherited from other packages(If you are in same package, it can be inherited)
    //Object Class parent class of all classes
    //Java does not support multi inheritance, a class can only have one parent class(single inheritance)
    //A parent class can have multiple child classes(Hierarchical Inheritance)
    //Java supports multi level inheritance(grandparents-parents-child)

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.meow();
        cat1.drink();
        cat1.eat();
        cat1.weight();


        Dog dog1 = new Dog();

        dog1.bark();
        dog1.drink();
        dog1.eat();


        Bird bird1 = new Bird();

        bird1.tweet();
        bird1.drink();
        bird1.eat();


    }

}
