package Lesson1;

public class Cat implements Actions {

    private String name;
    private int maxRun;
    private int maxJump;

    public Cat (String name, int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;

    }

    @Override
    public int run() {
        System.out.println("Кот " + name+ " бежит " + maxRun);
        return maxRun;
    }

    @Override
    public int jump() {
        System.out.println("Кот " + name+ " прыгает " + maxJump);
        return maxJump;
    }

    @Override
    public String infoName() {
        return name;
    }
}
