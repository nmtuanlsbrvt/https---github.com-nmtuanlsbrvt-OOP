package oop.shaperotateapp;

public class CircleTestDrive {
    public static void main(String[] args) {
        Circle circle = Circle("musicStringCircle.aif");
        circle.rotate();
        circle.playSound();

        circle.fileSound = "musicSummerCircle.aif";
        circle.playSound();
    }

    private static Circle Circle(String string) {
        return null;
    }
    
}
