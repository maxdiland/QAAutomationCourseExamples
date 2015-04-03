package lesson6;

import entities.Box;
import entities.BoxWithColor;
import entities.BoxWithMusic;
import entities.Music;

/**
 * author Maksim Diland
 */
public class Example1 {
    public static void main(String[] args) {

        Object box = new BoxWithColor(10,10,10,100, "blue");
        System.out.println( box.toString() );
    }
}

class Example2 {
    public static void main(String[] args) {
        Object box = new BoxWithColor(10,10,10,100, "blue");
        Object box1 = new BoxWithColor(10,10,10,100, "blue");
        System.out.println( box == box1 );
    }
}

class Example3 {
    public static void main(String[] args) {
        Object box = new BoxWithColor(10,10,10,100, "blue");
        Object box1 = box;
        System.out.println( box == box1 );
    }
}

class Example4 {
    public static void main(String[] args) {
        Box box = new BoxWithColor(10,10,10,100, "blue");
        Box box1 = box;
        box1.setWeight(2);

        System.out.println( box.getWeight() );
    }
}

class Example5 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        b++;

        System.out.println( a );
        System.out.println( b );
    }

}

class Example6 {
    public static void main(String[] args) {
        BoxWithColor box = new BoxWithColor(10,10,10,100, "blue");
        BoxWithColor box1 = new BoxWithColor(10,10,10,100, "blue");
        System.out.println( box.equals( box1 ) );
    }
}

class Example7 {
    public static void main(String[] args) {
        BoxWithColor box = new BoxWithColor(10,10,10,100, "blue");
        System.out.println(box.hashCode());
        System.out.println(box.hashCode());
    }
}


class Example8 {
    public static void main(String[] args) {
        BoxWithColor box = new BoxWithColor(1,10,100,100, "blue");
        BoxWithColor box1 = new BoxWithColor(10,10,10,100, "blue");
        System.out.println(box.hashCode());
        System.out.println(box1.hashCode());
    }
}

class Example9 {
    public static void main(String[] args) throws CloneNotSupportedException {
        BoxWithColor box = new BoxWithColor(1,10,100,100, "blue");
        Box box1 = (Box) box.clone();

        System.out.println(box == box1);
        System.out.println(box.equals(box1));

    }
}

class Example10 {
    public static void main(String[] args) {
        final int number = 10;

//        number++;

        System.out.println( number );
    }
}

class Example11 {
    public static void main(String[] args) {
        final int number;

        number = 10;

        System.out.println( number );
    }
}

class Example12 {
    public static void main(String[] args) {
        final Object object;
        object = new Object();
    }
}

class Example13 {
    public static void main(String[] args) {
        final int[] numbers = {1,5};
        numbers[0] = 14;
//        numbers = new int[0];
    }
}

class Example14 {
    public static void main(String[] args) throws CloneNotSupportedException {
        BoxWithMusic boxWithMusic = new BoxWithMusic(10, 10, 10, 100, new Music("ABC", "Hello"));

        BoxWithMusic boxWithMusic1 = (BoxWithMusic) boxWithMusic.clone();


        boxWithMusic1.getMusic().setAuthor("DEF");

        System.out.println( boxWithMusic.getMusic() );
    }
}


