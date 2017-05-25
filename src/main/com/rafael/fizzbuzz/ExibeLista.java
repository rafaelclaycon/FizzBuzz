package main.com.rafael.fizzbuzz;

import com.rafael.fizzbuzz.Valor;

public class ExibeLista {

    public static void main(String[] args) {
        FizzBuzz helper = new FizzBuzz();
        for (int i = 1; (i < 101); i++) {
            Valor valor = new Valor(i);
            System.out.println(helper.retorna(valor) + "\n");
        }
    }
}
