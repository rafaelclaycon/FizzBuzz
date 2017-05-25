package tests.com.rafael.fizzbuzz;

import com.rafael.fizzbuzz.Valor;
import main.com.rafael.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    public void deveRetornarFizzParaDivisiveisPor3() {
        Valor valor = new Valor(3);
        String retorno = new FizzBuzz().retorna(valor);

        Assertions.assertEquals("Fizz", retorno);
    }

    @Test
    public void deveRetornarBuzzParaDivisiveisPor5() {
        Valor valor = new Valor(5);
        String retorno = new FizzBuzz().retorna(valor);

        Assertions.assertEquals("Buzz", retorno);
    }

    @Test
    public void deveRetornarFizzBuzzParaDivisiveisPor3E5() {
        Valor valor = new Valor(15);
        String retorno = new FizzBuzz().retorna(valor);

        Assertions.assertEquals("FizzBuzz", retorno);
    }

    @Test
    public void deveRetornarProprioNumeroParaNaoDivisiveisPor3() {
        Valor valor = new Valor(2);
        String retorno = new FizzBuzz().retorna(valor);

        Assertions.assertEquals("2", retorno);
    }

    @Test
    public void deveRetornarProprioNumeroParaNaoDivisiveisPor5() {
        Valor valor = new Valor(11);
        String retorno = new FizzBuzz().retorna(valor);

        Assertions.assertEquals("11", retorno);
    }

    @Test
    public void deveRetornarProprioNumeroParaNaoDivisiveisPor3EPor5() {
        Valor valor = new Valor(8);
        String retorno = new FizzBuzz().retorna(valor);

        Assertions.assertEquals("8", retorno);
    }
}