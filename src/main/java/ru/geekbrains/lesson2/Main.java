package ru.geekbrains.lesson2;

public class Main {
    public static void main(String[] args) {
        try {
            String[][] str = {
                    {"2", "4", "5", "1"},
                    {"2", "4", "5", "1"},
                    {"2", "4", "5", "1"},
                    {"2", "4", "5", "1"}
            };
            System.out.println("Сумма = " + methodSum(str));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("Конец!!!");
    }

    static int methodSum(String[][] str) throws MyArraySizeException, MyArrayDataException {
        int a = 4;
        for (int i = 0; i < a; i++) {
            if (str.length != a || str[i].length != a) throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                try {
                    sum += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать в int (" + str[i][j] + ") в ячейке [" + i + "][" + j + "]" , i, j);
                }
            }
        }
        return sum;
    }
}
