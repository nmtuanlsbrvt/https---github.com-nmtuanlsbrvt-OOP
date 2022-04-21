package oop.shaperotateapp;

public class Amoeba {
    double xPoint;
    double yPoint;
    private String fileSound;

    public Amoeba(String fileSound){
        this.fileSound = fileSound;

    }

    public Amoeba(String fileSound, double xPoint, double yPoint) {
        this(fileSound);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
    
    void rotate(){
        System.out.println("Rotating 360 at xPoint: "+ this.xPoint + "yPoint: "+ this.yPoint);
        this.playSound();
    }

    void playSound(){
        System.out.println("Play file"+ this.fileSound +"music");
    }
    
}
