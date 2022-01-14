package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.Move.Cat;
import ru.geekbrains.lesson1.Move.Human;
import ru.geekbrains.lesson1.Move.Move;
import ru.geekbrains.lesson1.Move.Robot;
import ru.geekbrains.lesson1.Test.Test;
import ru.geekbrains.lesson1.Test.Track;
import ru.geekbrains.lesson1.Test.Wall;

public class Main {
    public static void main(String[] args) {

        Move[] moves = {
                new Human(),
                new Cat(),
                new Robot()
        };

        Test[] tests = {
                new Track(200),
                new Wall(2),
                new Track(300),
                new Wall(3)
        };

        for (Move m : moves){
            for (Test t : tests){
                if (!t.doIt(m)){
                    break;
                }
            }
        }
    }
}
