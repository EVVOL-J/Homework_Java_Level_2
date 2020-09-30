package Lesson2;

public class Lesson2 {
    private static final int REFERENCE_ARRAY_SIZE=4;
    public static void main(String[] args) {
        String[][] Error_Data_Array = {{"1", "2", "3", "4"}, {"1", "2", "3", "f"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] Error_Size_Array = {{"1", "2", "3"}, {"1", "2", "3", "f"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] Correct_Array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println("Сумма массива равна= " + sumIntArr(Error_Size_Array));
        }
        catch (MyArraySizeException e){
            System.out.println("Ошибка в размере массива");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        catch (MyArrayDataException e){
            System.out.println("Ошибка конвертации элемента массива в целое число");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static int sumIntArr(String[][] arr) throws MyArrayDataException,MyArraySizeException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != REFERENCE_ARRAY_SIZE || arr[i].length != REFERENCE_ARRAY_SIZE) throw new MyArraySizeException();
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}


