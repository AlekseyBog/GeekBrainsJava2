package ru.geekbrains.lesson1.Test;

import ru.geekbrains.lesson1.Move.Move;
import ru.geekbrains.lesson1.Test.Test;

public class Wall implements Test {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public boolean doIt(Move m) {
        return m.jump(height);
    }


}
