package Lesson1;

public class Wall implements Obstacles {


    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcameObstacles(Actions actions) {
        if (actions.jump() <= height) {
            System.out.println("Участник " + actions.infoName() + " не смог перодолеть стену " + height);
            return false;
        } else {
            System.out.println("Участник " + actions.infoName() + " перепрыгнул стену " + height);
            return true;
        }

    }

}
