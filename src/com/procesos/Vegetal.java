package com.procesos;

public class Vegetal {
    String name;

    public Vegetal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vegetal - " + name;
    }
}
