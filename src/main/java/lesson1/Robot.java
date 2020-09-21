package Lesson1;

public class Robot implements Actions {
    @Override
    public void run(int runLength) {
        System.out.println("Робот пробежал"+runLength);
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Робот проплыл"+ swimLength);}
}
