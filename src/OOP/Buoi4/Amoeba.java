package OOP.Buoi4;

public class Amoeba {
    String soundFile = "amoeba.hif";
    double xPoint;
    double yPoint;

    public Amoeba(String soundFile,Double xPoint, Double yPoint){
        this.soundFile = soundFile;
        this.xPoint = xPoint;
        this.yPoint = yPoint;

    }

    void rotate(){
        System.out.println("Xoay hình theo"  + this.xPoint + this.yPoint) ;
    }
    void playSound4(){
        System.out.println("Chơi file "+ this.soundFile);
    }
    
}
