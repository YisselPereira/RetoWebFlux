package com.sofka.yissel.retowebflux.model;

public class Client {
    private Integer clientID;
    private String nombre;

    public Client(Integer clientID, String nombre) {
        this.clientID = clientID;
        this.nombre = nombre;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
