package oop.shapeapp;

public class Circle {
    String soundFile;
    public Circle(String soundFile){
        this.soundFile = soundFile;
    }
    void rotate(){
        System.out.println("Rotating 360 ...");
        this.playSound();
    }
    void playSound(){
        System.out.println("Play file"+ this.soundFile +"music");
    }
}
