package Lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    private HashMap<String, HashSet<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void addNumber(String name, String number) {
        HashSet<String> exclusiveNumber = book.getOrDefault(name, new HashSet<>());
        exclusiveNumber.add(number);
        book.put(name, exclusiveNumber);
    }

    public void getNumber(String name) {

        System.out.println(name + ":" + book.getOrDefault(name, new HashSet<>()));
    }

}
