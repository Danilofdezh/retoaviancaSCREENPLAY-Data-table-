package com.co.avianca.models;

public class Data {
    public Data(String numeroreserva, String apellidospasajero) {
        this.numeroreserva = numeroreserva;
        this.apellidospasajero = apellidospasajero;
    }

    private String numeroreserva;
    private String apellidospasajero;



    public String getNumeroreserva() {
        return numeroreserva;
    }

    public void setNumeroreserva(String numeroreserva) {
        this.numeroreserva = numeroreserva;
    }

    public String getApellidospasajero() {
        return apellidospasajero;
    }

    public void setApellidospasajero(String apellidospasajero) {
        this.apellidospasajero = apellidospasajero;
    }
}
