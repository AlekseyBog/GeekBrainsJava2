package ru.geekbrains.lesson1.Test;

import ru.geekbrains.lesson1.Move.Move;
import ru.geekbrains.lesson1.Test.Test;

public class Track implements Test {

    private int lenght;

    public Track(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean doIt(Move m) {
        return m.run(lenght);
    }
}
