package ru.vsu.sc.uliyanov_n_s;

public class Test {
    public static boolean testingCorrectness = checkCorrectnessOfGetColor();

    static boolean checkCorrectnessOfGetColor() {
        if (Main.picture.getColor(0, 3) == SimpleColor.ORANGE) {
            System.out.println("(0; 3) => ORANGE");
        } else {
            System.out.println("(0; 3) => ERROR");
            return false;
        }
        if (Main.picture.getColor(-2, 0) == SimpleColor.GRAY) {
            System.out.println("(-2; 0) => GRAY");
        } else {
            System.out.println("(-2; 0) => ERROR");
            return false;
        }
        if (Main.picture.getColor(3, -6) == SimpleColor.BLUE) {
            System.out.println("(3; -6) => BLUE");
        } else {
            System.out.println("(3; -6) => ERROR");
            return false;
        }
        if (Main.picture.getColor(4, -5.5) == SimpleColor.BLUE) {
            System.out.println("(4; -5.5) => BLUE");
        } else {
            System.out.println("(4; -5.5) => ERROR");
            return false;
        }
        if (Main.picture.getColor(7, -9) == SimpleColor.BLUE) {
            System.out.println("(7; -8) => BLUE");
        } else {
            System.out.println("(7; -8) => ERROR");
            return false;
        }
        if (Main.picture.getColor(0, 0) == SimpleColor.YELLOW) {
            System.out.println("(0; 0) => YELLOW");
        } else {
            System.out.println("(0; 0) => ERROR");
            return false;
        }
        if (Main.picture.getColor(0, -3) == SimpleColor.BLUE) {
            System.out.println("(0;-3) => BLUE");
        } else {
            System.out.println("(0;-3) => ERROR");
            return false;
        }
        return true;
    }
}
