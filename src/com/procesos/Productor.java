package com.procesos;

public class Productor extends Thread {
    private Huerto huerto;
    private String semillas[] = {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "broccoli",
            "artichoke",
            "tomato",
            "cucumber",
            "eggplant",
            "carrot",
            "green bean"
    };

    public Productor(Huerto huerto ) {
        this.huerto = huerto;
        this.setPriority(10);
    }

    private Vegetal plantarVegetal() {
        String nombreVegetal = semillas[(int) (Math.random() * semillas.length)];
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Vegetal(nombreVegetal);
    }

    @Override
    public void run() {
        while(huerto.getNumProduccion() > 0) {
            Vegetal vegetal = plantarVegetal();
            if (huerto.getNumProduccion() > 0) {
                System.out.println("Productor -> " + vegetal);
                huerto.añadirVegetal(vegetal);
            }

        }
    }
}
