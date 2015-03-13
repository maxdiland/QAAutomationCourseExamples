package lesson3;

/**
 * author Maksim Diland
 */
public class Example1 {
    public static void main(String[] args) {
        int width = 15;
        int height = 15;

        if (width == height) {
            System.out.println("This is a square");
        } else {
            System.out.println("This is a rectangle");
        }

    }
}


class Example2 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("hello world!");
            counter++;
        }

        System.out.println(counter);
    }
}

class Example3 {
    public static void main(String[] args) {
        int counter = 10;
        do {
            System.out.println("hello world!");
            counter++;
        } while (counter < 10);

        System.out.println(counter);
    }
}

class Example4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }
    }
}

class Example5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 47;
        numbers[1] = 5;
        numbers[5] = 123;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
    }
}

class Example6 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,4,6,8,3,6,8,5,3,6};
        int[] numbers2 = {1,4,6,8,3,6,8,5,3,6};

        int[] numbers3 = {};
        int[] numbers4 = new int[0];

        System.out.println(numbers3[0]);
    }
}

class Example7 {
    public static void main(String[] args) {
        int[] numbers = null;

        if (true) {
            numbers = new int[]{5};
        }



        System.out.println( numbers[0] );
    }
}

class Example8 {
    public static void main(String[] args) {
        long[] numbers = {23,412,523,236,547,47,6354,34,423,5325,634};
        for (int i = 0; i < numbers.length;i++) {
            while (true) {
                break;
            }


            if (i % 2 != 0) {
                return;
            }

            System.out.println(numbers[i]);
//            System.out.println(i);
        }

    }
}


