package OOP.Buoi4;

public class Amoeba {
    String soundFile = "amoeba.hif";
    int x;
    int y;

    public Amoeba(String soundFile){
        this.soundFile = soundFile;

    }

    void rotate(){
        System.out.println("Xoay hình theo 360 độ);
    }
    void playSound4(){
        System.out.println("Chơi file "+ this.soundFile);
    }
    
}
