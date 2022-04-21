package oop.shapeapp;

public class Amoeba {
    double xPoint;
    double yPoint;
    private String soundFile;

    public Amoeba(String soundFile){
        this.soundFile = soundFile;

    }

    public Amoeba(String soundFile, double xPoint, double yPoint) {
        this(soundFile);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
    
    void rotate(){
        System.out.println("Rotating 360 at xPoint: "+ this.xPoint + "yPoint: "+ this.yPoint);
        this.playSound();
    }

    void playSound(){
        System.out.println("Play file"+ this.soundFile +"music");
    }
    
    
}
