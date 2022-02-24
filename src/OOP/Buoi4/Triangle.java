package OOP.Buoi4;

public class Triangle {
    private String soundFile = "hinhtamgiac.aif";

    public Triangle1(String soundFile){
        this.soundFile = soundFile;

    }

    void rotate(){
        System.out.println("Xoay hình 360 độ");
    }
    void playSound3(){
        System.out.println("Chơi file "+ this.soundFile);
    }
    
}
