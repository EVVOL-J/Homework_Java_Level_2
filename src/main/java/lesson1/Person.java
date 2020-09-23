package Lesson1;

public class Person implements Actions {
    private String name;
    private int maxRun;
    private int maxJump;

    public Person(String name, int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;

    }

    @Override
    public int run() {
        System.out.println("Человек " + name + " бежит " + maxRun);
        return maxRun;
    }

    @Override
    public int jump() {
        System.out.println("Человек " + name + " прыгает " + maxJump);
        return maxJump;
    }

    @Override
    public String infoName() {
        return name;
    }
}
