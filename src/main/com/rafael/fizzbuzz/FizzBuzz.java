package main.com.rafael.fizzbuzz;

import com.rafael.fizzbuzz.Valor;

public class FizzBuzz {

    private String resultado = "";

    public String retorna(Integer numero) {

        Valor valor = new Valor(numero);

        if (valor.eDivisivelPor(3)) {
            resultado = "Fizz";
        }

        if (valor.eDivisivelPor(5)) {
            resultado += "Buzz";
        }

        if (resultado.isEmpty()) {
            resultado = numero.toString();
        }

        return resultado;
    }
}
