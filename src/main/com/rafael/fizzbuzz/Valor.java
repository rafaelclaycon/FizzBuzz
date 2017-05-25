package com.rafael.fizzbuzz;

public class Valor {

    private Integer numero;

    public Valor(Integer numero) {
        this.numero = numero;
    }

    public Boolean eDivisivelPor(Integer divisor) {
        return ((this.numero % divisor) == 0);
    }

    public String toString() {
        return this.numero.toString();
    }
}
