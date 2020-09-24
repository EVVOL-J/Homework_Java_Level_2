package Lesson2;

public class MyArraySizeException extends RuntimeException{
    private int numberCols;
    private int numberRows;
    public MyArraySizeException(String string){
        System.out.printf(string);
    }

}
