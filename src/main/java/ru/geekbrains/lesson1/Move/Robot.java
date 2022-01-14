package ru.geekbrains.lesson1.Move;

import ru.geekbrains.lesson1.Move.Move;

public class Robot implements Move {

    private final int MAX_RUN;
    private final int MAX_JUMP;

    public Robot(int MAX_RUN, int MAX_JUMP) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP = MAX_JUMP;
    }

    public Robot(){
        this(1000,3);
    }

    @Override
    public boolean run(int size) {
        if (size <= MAX_RUN) {
            System.out.println("Robot run "+ size + " m");
            return true;
        }else {
            System.out.println("Robot can't run "+ size + " m");
            return false;
        }
    }

    @Override
    public boolean jump(int size) {
        if (size <= MAX_JUMP) {
            System.out.println("Robot jump "+ size + " m");
            return true;
        }else {
            System.out.println("Robot can't jump "+ size + " m");
            return false;
        }
    }
}
