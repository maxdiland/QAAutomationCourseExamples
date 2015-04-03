package lesson7;

import entities.AbstractArraySorter;
import entities.Box;
import entities.BoxWithMusic;
import entities.BubbleArraySorter;
import entities.MathUtil;
import entities.Moveable;
import entities.VarArgsDemo;

/**
 * author Maksim Diland
 */
public class Example1 {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box();

        Class boxClass = box.getClass();
        Class boxClass1 = box1.getClass();

        System.out.println( boxClass == boxClass1 );
        System.out.println( boxClass.getName() );
    }
}

class Example2 {
    public static void main(String[] args) {
        BoxWithMusic bwm = new BoxWithMusic();

        Class bwmClass = bwm.getClass();

        System.out.println( bwm instanceof Box );
        System.out.println( bwmClass  == Box.class );

    }
}

class Example3 {
    public static void main(String[] args) {
        AbstractArraySorter bubbleArraySorter = new BubbleArraySorter();
        System.out.println(bubbleArraySorter.getSortingName());
    }
}

class Example4 {
    public static void main(String[] args) {

        VarArgsDemo varArgsDemo = new VarArgsDemo();

        System.out.println( varArgsDemo.calculateSum(1, 4, 5, 6, 1, 6) );

    }
}

class Example5 {
    public static void main(String[] args) {
        System.out.println( MathUtil.calculateSum(1, 2, 7, 1, 6, 8) );
        System.out.println( MathUtil.Pi );
    }
}

class Example6 {
    public static void main(String[] args) {
        MathUtil.calculateSum(1, 2, 3, 4, 5);
    }
}

class Example7 {
    public static void main(String[] args) {
//        Moveable.SOME_VALUE;
    }
}
