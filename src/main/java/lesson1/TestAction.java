package Lesson1;

import java.util.Random;

public class TestAction {
    public static void main(String[] args) {
        Actions person = new Person("Александр", 3000, 50);
        Actions cat = new Cat("Барсик", 1500, 200);
        Actions robot = new Robot("Boston Dynamics Dog", 5000, 100);
        Actions[] actions = new Actions[]{person, cat, robot};
        Random random = new Random();
        int numberObstacles = 3;
        Obstacles[] walls = new Wall[numberObstacles];
        Obstacles[] treadmills = new Treadmill[numberObstacles];
        StringBuffer winList = new StringBuffer();
        winList.append("\n Список победителей: \n");
        for (int i = 0; i < numberObstacles; i++) {//Создание препятсвий
            walls[i] = new Wall(random.nextInt(150));
            treadmills[i] = new Treadmill(random.nextInt(3000));
        }
        Obstacles[][] obstacles = new Obstacles[][]{walls, treadmills};
        System.out.println("Начало соревнований \n");
        System.out.println("Список участников:");
        for (Actions act : actions) {
            System.out.println(act.getClass().getSimpleName() + ": " + act.infoName());
        }
        System.out.println("\n Старт \n");
        for (Actions act : actions) {
            boolean droppedOut = false;
            for (Obstacles obsOut[] : obstacles) {
                if (droppedOut) break;
                for (Obstacles obsIn : obsOut) {
                    if (!obsIn.overcameObstacles(act)) {
                        System.out.println("Участник "+ act.infoName() + " выбыл \n");
                        droppedOut = true;
                        break;
                    }
                }
            }
            if(!droppedOut) winList.append(act.infoName()+"\n");
        }
        System.out.println(winList);

    }


}
