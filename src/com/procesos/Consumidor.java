package com.procesos;

public class Consumidor extends Thread {
    Huerto huerto;

    public Consumidor(Huerto huerto){
        this.huerto = huerto;
    }

    public void run(){
        while(huerto.getNumProduccion() > 0) {
            huerto.sacarVegetal();
        }
    }
}
