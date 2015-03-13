package lesson2;

/**
 * author Maksim Diland
 */
public class Example1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = a + b;
        int d = 25 / 3;
        System.out.println(d);
    }
}

class Example2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        int c = a + b;
        c += 3; // c = c + 3;
        c++; // c = c + 1;
        c = 5;
        c--; // c = c - 1; (c = 4)
//        int d = c--; // 1) d = c; 2) c = c - 1;
        int d = --c; // 1) c = c - 1; 2) d = c;
        System.out.println("d: " + d);
        System.out.println("c: " + c);
    }
}

class Example3 {
    public static void main(String[] args) {
        int a = (2 + 3) * 5;
        System.out.println(a);
    }
}

class Example4 {
    public static void main(String[] args) {
        double a = 10;
        int b = 3;
        double c = a / b;
        System.out.println(c);
    }
}

class Example5 {
    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte) (a + 1);
        System.out.println(b);
    }
}

class Example6 {
    public static void main(String[] args) {
        long a = 365_464_563_244L;
//        float b = (float) (10D / 3);
        float b = (float) (10.0 / 3);

        char c = 'a';
        c--;

        System.out.println(c);
    }
}

class Example7 {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
    }
}

class Example8 {
    public static void main(String[] args) {
        int radius = 5;
        int diameter = 2 * radius;
        double Pi = 3.1415;
        double length = Pi * diameter;
        double square = Pi * radius * radius;

        System.out.println("Radius: " + radius + "\n" + "Diameter: " + diameter + "\n");
    }
}

class Example9 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = !a;

        System.out.println(a);
        System.out.println(b);

        int c = 5;
        int d = 6;
        boolean areNumbersEqual = c == d;

        System.out.println(areNumbersEqual);
        System.out.println("Is c > d: " + (c > d) );
        System.out.println("Is c < d: " + (c < d) );
        System.out.println("Is c >= d: " + (c >= d) );
        System.out.println("Is c <= d: " + (c <= d) );
        System.out.println("Are c and d not equal?: " + (c != d) );
    }
}

class Example10 {
    public static void main(String[] args) {
        boolean isPhoneRed = false;
        boolean isPhoneWindowsOsDriven = true;
        boolean shouldIBuyThePhone = isPhoneRed & isPhoneWindowsOsDriven;

        String someString = null;
        int a = 0;

        boolean answer = someString == null | ++a == 1;
        System.out.println(a);
    }
}
