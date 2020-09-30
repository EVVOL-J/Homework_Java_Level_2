package Lesson2;

import javax.sound.midi.Soundbank;

public class MyArrayDataException extends NumberFormatException{

   public MyArrayDataException(int i, int j){
       super("Элемент ["+i+"]["+j+"] не является целым\n");
   }

}
