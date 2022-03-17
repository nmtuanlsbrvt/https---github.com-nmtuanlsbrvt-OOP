package oop.Buoi4;

public class Square {
    private String soundFile = "hinhvuong.aif";

    public Square1(String soundFile){
        this.soundFile = soundFile;

    }

    void rotate(){
        System.out.println("Xoay hình 360 độ");
    }
    void playSound1(){
        System.out.println("Chơi file "+ this.soundFile);
    }
    
}
