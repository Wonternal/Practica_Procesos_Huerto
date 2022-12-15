package com.procesos;

import java.util.ArrayList;

public class Huerto {
    static ArrayList<Vegetal> tienda = new ArrayList<>();

    private int numProduccion;


    public Huerto(int numProduccion) {
        this.numProduccion = numProduccion;
    }

    public int getNumProduccion(){
        return this.numProduccion;
    }

    public synchronized void añadirVegetal(Vegetal vegetal) {
        tienda.add(vegetal);
        this.numProduccion--;
        notifyAll();
    }

    public synchronized void sacarVegetal(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (tienda.size() > 0) {
            System.out.println("Consumidor -> " + tienda.remove(0));
        }
    }
}
