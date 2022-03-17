package oop.Buoi4;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        square.rotate();
        square.playSound1();

        Circle circle = new Circle();
        circle.rotate();
        circle.playSound2();

        Triangle triangle = new Triangle();
        triangle.rotate();
        triangle.playSound3();

        Amoeba amoeba = new Amoeba("amoeba.hif",10,7);
        amoeba.rotate();
        amoeba.playSound4();
    }
    
}
