package OOP.Buoi4;

public class Circle {
    String soundFile = "hinhtron.aif";

    public Circle1(String soundFile){
        this.soundFile = soundFile;

    }

    void rotate(){
        System.out.println("Xoay hình 360 độ");
    }
    void playSound2(){
        System.out.println("Chơi file "+ this.soundFile);
    }


    
}
