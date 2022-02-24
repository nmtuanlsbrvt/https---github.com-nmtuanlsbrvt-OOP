package OOP.Buoi4;

public class Player {
    private int number = 0;
    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println("I'm guessing"+ number);
    }
    
}
