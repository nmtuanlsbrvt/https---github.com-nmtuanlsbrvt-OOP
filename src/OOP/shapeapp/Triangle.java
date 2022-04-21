package oop.shapeapp;

public class Triangle {
    String soundFile;

    public Triangle(String soundFile) {
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
