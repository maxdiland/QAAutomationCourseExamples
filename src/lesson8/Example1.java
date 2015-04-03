package lesson8;

import entities.Box;
import entities.SimpleContainer;
import entities.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * author Maksim Diland
 */
public class Example1 {

    public static void main(String[] args) {
        List objects = new ArrayList();
        System.out.println( objects.size() );
        objects.add("Hello");
        objects.add("world");
        objects.add("!!!");
        objects.add("=)");
        objects.add("Kevin");
        objects.add("User");
        objects.add("pc");
        objects.add("work");
        objects.add("(=");
        objects.add("(=");
        objects.add("(=");
        System.out.println(objects.size());


        System.out.println( objects.get(3) );



//        System.out.println( objects.get(11) );

        objects.add(new Box(10,10,10,100));

        Object gottenObject = objects.get(10);

        Box gottenBox = (Box) gottenObject;

        System.out.println( gottenBox.calculateVolume() );
    }

}

class Example2 {
    public static void main(String[] args) {
        SimpleContainer<Box> container = new SimpleContainer<Box>();

        container.put( new Box(10, 10, 10, 100) );

        Box box = container.get();

        System.out.println( box.calculateVolume() );
    }
}

class Example3 {
    public static void main(String[] args) {
        Set<Box> boxes = new HashSet<>();

        System.out.println( boxes.add( new Box(10, 10, 10, 100) ) );
        System.out.println(boxes.add(new Box(10, 10, 10, 100)));
        System.out.println( boxes.size() );
    }
}

class Example4 {
    public static void main(String[] args) {
        // int -> Integer
        // char -> Character
        // long -> Long
        // boolean -> Boolean

        Boolean bool = true; // new Boolean(true);
    }
}


class Example5 {
    public static void main(String[] args) {
        Map<Long, User> userMap = new HashMap<Long, User>();

        User user1 = new User(1, "max", "123");
        User user2 = new User(2, "alex", "321");
        userMap.put( user1.getId(), user1 );
        userMap.put( user2.getId(), user2 );
    }
}

class Example6 {
    public static void main(String[] args) {

//        try {
            int result = getSum(2, null);
//        } catch (IllegalArgumentException iae) {
//            System.out.println( "Sum was not calculated due to bad arguments" );
//        }
        System.out.println( "Program is going to exit" );
    }


    public static int getSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }


        return num1 + num2;
    }
}
