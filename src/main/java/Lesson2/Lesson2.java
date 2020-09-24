package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"}, {"1", "2", "3", "f"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(sumIntArr(arr));
        String[][] arr1 = {{"1", "2", "3"}, {"1", "2", "3", "f"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(sumIntArr(arr1));
        String[][] arr2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(sumIntArr(arr2));


    }

    private static boolean sumIntArr(String[][] arr) {
        int sum = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < arr.length; i++) {

                for (j = 0; j < arr[i].length; j++) {
                    if (arr.length != 4 || arr[i].length != 4)
                        throw new MyArraySizeException("Размер массива отличается от 4x4 или массив не равномерный \n");
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
            System.out.println("Сумма равна= "+sum);
            return true;

        } catch (MyArraySizeException e) {
            return false;

        } catch (NumberFormatException e) {
            try {
                throw new MyArrayDataException("Элемент ["+i+"]["+j+"] не является целым\n");
            } catch (MyArrayDataException e1) {
                return false;
            }


        }
    }
}


