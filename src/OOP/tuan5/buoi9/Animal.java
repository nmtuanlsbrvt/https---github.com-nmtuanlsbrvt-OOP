package oop.tuan5.buoi9;

public abstract class Animal {
    private String picture;
    private String food;
    private int hunger;
    private String ten;
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    private String name;

    protected abstract void makeNoise();

    protected void sleep(){
        System.out.println("Sleeping ...");
    }
    
    protected abstract void eat();

    protected void roam(){
        System.out.println("Roaming ...");
    }
    
}
