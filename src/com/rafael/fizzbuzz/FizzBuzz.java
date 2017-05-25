package com.rafael.fizzbuzz;

public class FizzBuzz {

    private String resultado = "";

    private Boolean eDivisivelPor(Integer dividendo, Integer divisor) {
        return ((dividendo % divisor) == 0);
    }

    public String retorna(Integer numero) {

        if (eDivisivelPor(numero, 3)) {
            resultado = "Fizz";
        }

        if (eDivisivelPor(numero, 5)) {
            resultado += "Buzz";
        }

        if (resultado.isEmpty()) {
            resultado = numero.toString();
        }

        return resultado;
    }
}
