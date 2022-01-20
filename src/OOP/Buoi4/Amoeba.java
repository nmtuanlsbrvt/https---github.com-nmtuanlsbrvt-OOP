package OOP.Buoi4;

public class Amoeba {
    String soundFile = "amoeba.hif";
    int x;
    int y;

    public Amoeba(String soundFile){
        this.soundFile = soundFile;

    }
    public Amoeba(int x, int y){
        this.x = x;
        this.y = y;
    }

    void rotate(){
        System.out.println("Xoay hình theo tọa độ" + this.x + this.y);
    }
    void playSound4(){
        System.out.println("Chơi file "+ this.soundFile);
    }
    
}
