package Lesson1;

public class Person implements Actions {
    @Override
    public void run(int runLength) {
        System.out.println("Человек пробежал"+runLength);
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Человек проплыл"+ swimLength);}
}
