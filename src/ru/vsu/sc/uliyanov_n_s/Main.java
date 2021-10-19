package ru.vsu.sc.uliyanov_n_s;

import ru.vsu.sc.uliyanov_n_s.figures.Circle;
import ru.vsu.sc.uliyanov_n_s.figures.Line;
import ru.vsu.sc.uliyanov_n_s.figures.VerticalParabola;

import java.util.Scanner;

public class Main {
    private static final Line L = new Line(0, -1, -1);
    private static final VerticalParabola P = new VerticalParabola(-2, -3, -1);
    private static final Circle C = new Circle(-2, 2, 3);

    public static Picture picture = new Picture(L, P, C);

    public static void main(String[] args) {
        if (Test.testingCorrectness) {
            printFirstPhrase();

            double x = readCoordinates("X");
            double y = readCoordinates("Y");

            SimpleColor color = picture.getColor(x, y);

            printColor(x, y, color);
        }
    }

    static void printFirstPhrase() {
        System.out.println("Enter two coordinates of the point in the range from -10 to 10");
    }

    static double readCoordinates(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s:", text);

        double cord;

        if (scanner.hasNextDouble()) {
            cord = scanner.nextDouble();
            if (cord > 10 || cord < -10) {
                System.out.println("Invalid value! Yoy need to enter a number in the range from -10 to 10! Try again.");
                return readCoordinates(text);
            }
        } else {
            System.out.println("Invalid value! Yoy need to enter a NUMBER! Try again.");
            return readCoordinates(text);
        }

        return cord;
    }

    static void printColor(double x, double y, SimpleColor color) {
        System.out.printf("(%s, %s) -> %s", x, y, color);
    }
}
