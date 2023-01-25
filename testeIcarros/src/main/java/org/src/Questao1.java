package org.src;

public class Questao1 extends functions {
    public static void main(String[] args)
    {
       for (int i = 1 ; i <= 100; i++) {
           if (divideBy3(i) && divideBy5(i) == true) System.out.println("FizzBuzz!");

           else if(divideBy3(i) == true) System.out.println("Fizz!");

           else if(divideBy5(i) == true) System.out.println("Buzz!");

           else {
               System.out.println("Valor nao divisivel por 3 ou 5: " + i);
           }
       }
    }
}