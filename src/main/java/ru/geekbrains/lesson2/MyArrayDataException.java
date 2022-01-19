package ru.geekbrains.lesson2;

public class MyArrayDataException extends NumberFormatException {
    private int row;
    private int col;

    public MyArrayDataException(String s, int row, int col) {
        super(s);
        this.row = row;
        this.col = col;
    }
}
