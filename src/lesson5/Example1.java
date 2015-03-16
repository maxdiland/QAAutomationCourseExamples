package lesson5;

import entities.Box;
import entities.BoxWithColor;

import java.util.Objects;

/**
 * author Maksim Diland
 */
public class Example1 {
    public static void main(String[] args) {
        Box boxWithColor = new BoxWithColor(10F, 10F, 10F, 100F, "green");
        System.out.println( boxWithColor.calculateVolume() );


        if (boxWithColor instanceof BoxWithColor) {
            BoxWithColor boxWithColor1 = (BoxWithColor) boxWithColor;
        }


//        boxWithColor.setHeight();
//        boxWithColor.setWidth();
//        boxWithColor.setDepth();
//        boxWithColor.setWeight();
//        boxWithColor.setColor();
    }
}
