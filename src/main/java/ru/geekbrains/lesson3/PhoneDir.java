package ru.geekbrains.lesson3;

import java.util.*;

public class PhoneDir {

    private Map<String, Set<Integer>> phoneDir = new HashMap<>();

    public void add (String surname, Integer phone) {
        Set<Integer> phones = phoneDir.getOrDefault(surname, new HashSet<>());
        phones.add(phone);
        phoneDir.put(surname, phones);
    }

    public Set<Integer> get(String surname){
        return phoneDir.get(surname);
    }
}



