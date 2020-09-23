package Lesson1;

public class Treadmill implements Obstacles {


    private int length;
    public Treadmill(int height){
        this.length=height;
    }
    @Override
    public boolean overcameObstacles(Actions actions){
        if(actions.run()<=length){
            System.out.println("Участник "+ actions.infoName() + " не смог пробежать "+ length);
            return false;
        }
        else
        {
            System.out.println("Участник "+ actions.infoName() + " пробежал "+ length);
            return true;
        }

    }

}
