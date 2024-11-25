package com.tune8d.chapter7;


class Monster{
    boolean frighten(int d){
        System.out.println("arghh");
        return true;
    }
}

class Vampire extends Monster{
    boolean frighten(byte f){
        System.out.println("a bite?");
        return true;
    }
}

/*
So overriding needs to have a consistent set of return types and parameters.
 */

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster2 = new Vampire(); // arghh

        //Vampire monster2 = new Vampire(); // a bite?

        byte c = 10;
        monster2.frighten(c);
        monster.frighten(1);
    }
}
