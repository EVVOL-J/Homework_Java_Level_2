package Lesson3;

import java.util.HashMap;

public class CollectionTest {
    public static void main(String[] args) {
        String[] name = {"Вася", "Петя", "Вова", "Саша", "Женя", "Саша", "Петя", "Олег", "Никита", "Рома", "Петя", "Саша", "Вася", "Миша", "Ярик", "Лёша", "Дима", "Влад", "Рома"};
        HashMap<String, Integer> nameInfo = new HashMap<>();
        for (String nameFor : name) {
            nameInfo.put(nameFor, nameInfo.getOrDefault(nameFor, 0) + 1);
        }
        System.out.println(nameInfo);

        Phonebook phonebook = new Phonebook();
        phonebook.addNumber("Вася", "909");
        phonebook.addNumber("Вася", "907");
        phonebook.addNumber("Катя", "707");
        phonebook.addNumber("Петя", "404");
        phonebook.addNumber("Катя", "505");


        phonebook.getNumber("Вася");
        phonebook.getNumber("Катя");
        phonebook.getNumber("Петя");

    }
}
