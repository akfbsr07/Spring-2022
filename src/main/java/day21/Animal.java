package day21;

//Parents can not use methods from child classes
//Private methods are invisible for other classes.You can not use them from child classes

import day20.Creatures;

public class Animal extends Creatures{

     public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }




}
