package oop.shaperotateapp;

public class AmoebaTestDrive {
    Amoeba amoeba = new Amoeba("amoeba.hif, 5.5, 2.3");

    amoeba.fileSound = "amoeba.aif";
    amoeba.playSound();

    amoeba.rotate();

    
}
