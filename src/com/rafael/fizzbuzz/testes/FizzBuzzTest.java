package com.rafael.fizzbuzz.testes;

import com.rafael.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    public void deveRetornarFizzParaDivisiveisPor3() {
        String retorno = new FizzBuzz().retorna(3);

        Assertions.assertEquals("Fizz", retorno);
    }

    @Test
    public void deveRetornarBuzzParaDivisiveisPor5() {
        String retorno = new FizzBuzz().retorna(5);

        Assertions.assertEquals("Buzz", retorno);
    }

    @Test
    public void deveRetornarFizzBuzzParaDivisiveisPor3E5() {
        String retorno = new FizzBuzz().retorna(15);

        Assertions.assertEquals("FizzBuzz", retorno);
    }

    @Test
    public void deveRetornarProprioNumeroParaNaoDivisiveisPor3() {
        String retorno = new FizzBuzz().retorna(2);

        Assertions.assertEquals("2", retorno);
    }

    @Test
    public void deveRetornarProprioNumeroParaNaoDivisiveisPor5() {
        String retorno = new FizzBuzz().retorna(11);

        Assertions.assertEquals("11", retorno);
    }

    @Test
    public void deveRetornarProprioNumeroParaNaoDivisiveisPor3EPor5() {
        String retorno = new FizzBuzz().retorna(8);

        Assertions.assertEquals("8", retorno);
    }
}