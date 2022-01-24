package ru.geekbrains.lesson3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] word = {"a", "b", "c", "d", "e", "d", "a", "f", "c", "m", "g"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            Integer count = map.getOrDefault(word[i], 0);
            map.put(word[i], count + 1);
        }
        System.out.println(map);

        PhoneDir phoneDir = new PhoneDir();
        phoneDir.add("Ivanov", 12345);
        phoneDir.add("Petrov", 1234523);
        phoneDir.add("Nikolaev", 1234545);
        phoneDir.add("Shevcov", 1234576);
        phoneDir.add("Ivanov", 1234538);

        System.out.println(phoneDir.get("Ivanov"));
        System.out.println(phoneDir.get("Petrov"));
    }
}
