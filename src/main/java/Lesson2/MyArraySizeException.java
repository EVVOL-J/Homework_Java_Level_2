package Lesson2;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException(){
        super("Размер массива отличается от 4x4 или массив не равномерный \n");
    }

}
