package oop.shaperotateapp;

public class Circle {
    String fileSound;

    public Circle(String fileSound) {
        this.fileSound = fileSound;
    }

    void rotate(){
        System.out.println("Rotating 360 ...");
    }

    void playSound(){
        System.out.println("Play file " + this.fileSound + " music");
    }
    
    
}
