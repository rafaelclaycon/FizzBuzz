package com.rafael.fizzbuzz;

public class ExibeLista {

    public static void main(String[] args) {
        FizzBuzz helper = new FizzBuzz();
        for (int i = 1; (i < 101); i++) {
            System.out.println(helper.retorna(i) + "\n");
        }
    }
}
