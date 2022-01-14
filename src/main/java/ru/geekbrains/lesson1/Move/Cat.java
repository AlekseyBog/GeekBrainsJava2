package ru.geekbrains.lesson1.Move;

import ru.geekbrains.lesson1.Move.Move;

public class Cat implements Move {

    private final int MAX_RUN;
    private final int MAX_JUMP;

    public Cat(int MAX_RUN, int MAX_JUMP) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP = MAX_JUMP;
    }

    public Cat(){
        this(200,2);
    }

    @Override
    public boolean run(int size) {
        if (size <= MAX_RUN) {
            System.out.println("Cat run "+ size + " m");
            return true;
        }else {
            System.out.println("Cat can't run "+ size + " m");
            return false;
        }
    }

    @Override
    public boolean jump(int size) {
        if (size <= MAX_JUMP) {
            System.out.println("Cat jump "+ size + " m");
            return true;
        }else {
            System.out.println("Cat can't jump "+ size + " m");
            return false;
        }
    }
}
