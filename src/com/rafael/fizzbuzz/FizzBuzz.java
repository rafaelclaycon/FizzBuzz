package com.rafael.fizzbuzz;

public class FizzBuzz {

    private Boolean eDivisivelPor3(Integer numero) {
        return ((numero % 3) == 0);
    }

    private Boolean eDivisivelPor5(Integer numero) {
        return ((numero % 5) == 0);
    }

    public String retorna(Integer numero) {
        if (eDivisivelPor3(numero) && eDivisivelPor5(numero)) {
            return "FizzBuzz";
        } else {
            if (eDivisivelPor3(numero)) {
                return "Fizz";
            } else if (eDivisivelPor5(numero)) {
                return "Buzz";
            } else {
                return numero.toString();
            }
        }
    }
}
