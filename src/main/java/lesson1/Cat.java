package Lesson1;

public class Cat implements Actions {

    @Override
    public void run(int runLength) {
        System.out.println("Кот пробежал"+runLength);
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Кот проплыл"+ swimLength);
    }
}
