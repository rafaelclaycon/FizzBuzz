package main.com.rafael.fizzbuzz;

import com.rafael.fizzbuzz.Valor;

public class FizzBuzz {

    public String retorna(Valor valor) {

        String resultado = "";

        if (valor.eDivisivelPor(3)) {
            resultado = "Fizz";
        }

        if (valor.eDivisivelPor(5)) {
            resultado += "Buzz";
        }

        if (resultado.isEmpty()) {
            resultado = valor.toString();
        }

        return resultado;
    }
}