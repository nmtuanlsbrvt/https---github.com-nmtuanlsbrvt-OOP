package oop.tuan6.buoi10;

import java.util.ArrayList;

import oop.tuan5.buoi9.Animal;
import oop.tuan5.buoi9.Dog;

public class DanhSachThu {
    private List<Animal> danhSach = new ArrayList<>();

    public void them(Animal animal){
        danhSach.add(animal);
    }
    public Animal timKiemThu(String ten){
        Animal animal = null;
        for (Animal a : danhSach) {
            if(a.getTen().equals(ten)){
                animal =a;
            }
            
        }
        return animal;
    }
    public Dog timkiemDog(String ten){
        Dog dog = null;
        for (Animal a : danhSach) {
            if(a.getTen().equals(ten) && a instanceof Dog){
                dog = (Dog) a;

            }
            
        }
        return dog;
    }
    
}
