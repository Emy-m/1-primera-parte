package main;

import model.Coche;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Primera parte: " + primeraParte(1,2,3));
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Segunda parte: " + miCoche.obtenerPuertas());
    }

    private static int primeraParte(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}
