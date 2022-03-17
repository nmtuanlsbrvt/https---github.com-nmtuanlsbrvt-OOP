package oop.Buoi5;

public class Animal {
    private String picture;
    private String food;
    private int hunger;

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getPicture() {
        return picture;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getFood() {
        return food;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getHunger() {
        return hunger;
    }

    protected makeNoise(){
        System.out.println("Making noise...");
    }
    protected void sleep(){
        System.out.println("Sleeping...");
    }
    protected void eat(){
        System.out.println("Eating...");
    }
    protected void roam(){
        System.out.println("Roaming...");
    }
    
}
