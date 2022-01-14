package ru.geekbrains.lesson1.Move;

import ru.geekbrains.lesson1.Move.Move;

public class Human implements Move {

    private final int MAX_RUN;
    private final int MAX_JUMP;

    public Human(int MAX_RUN, int MAX_JUMP) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP = MAX_JUMP;
    }

    public Human(){
        this(500,1);
    }

    @Override
    public boolean run(int size) {
        if (size <= MAX_RUN) {
            System.out.println("Human run "+ size + " m");
            return true;
        }else {
            System.out.println("Human can't run "+ size + " m");
            return false;
        }
    }

    @Override
    public boolean jump(int size) {
        if (size <= MAX_JUMP) {
            System.out.println("Human jump "+ size + " m");
            return true;
        }else {
            System.out.println("Human can't jump "+ size + " m");
            return false;
        }
    }
}
