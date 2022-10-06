package it.Adiener.core.EsercizioFunction;

//        Ex 1
//        creare con l'apposita strategia, un predicato che permette di stabilire se la stringa passata in ingresso è palindroma.
//        testare con 3 valori differenti
//
//        Ex 2
//        creare una funzione che, prendendo una stringa in ingresso, restituisce il suo carattere finale
//        testare con 3 valori differenti
//
//        Ex 3
//        creare un'interfaccia funzionale chiamata Math con un metodo double run(double x, double y)
//        creare 4 istanze di tale interfaccia per sommare, moltiplicare, dividere e sommare/poi/moltiplicare

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Math {
    double apply(double x, double y);
}


public class Main {
    public static void main( String[] args ) {

//    EX1
        Predicate<String> isPalindrome = ( s ) -> {
            String reverse = new StringBuilder( s ).reverse().toString();
            return s.equals( reverse ) ? true : false;
        };

        Function<String, Character> lastChar = ( s) -> {
            return s.charAt( s.length() - 1);
        };

        Math add = (x, y) -> x + y;
        Math times = (x, y) -> x * y;
        Math divide = (x, y) -> x / y;
        Math addAndTime = (x, y) -> add.apply(x, y) * times.apply( x, y );

        System.out.println(isPalindrome.test("casa"));
        System.out.println(isPalindrome.test("anna"));
        System.out.println(lastChar.apply("budkayo"));
        System.out.println(add.apply( 3, 6 ));
        System.out.println(times.apply( 3, 6 ));
        System.out.println(divide.apply( 3, 6 ));
        System.out.println(addAndTime.apply( 3, 6 ));

    }
}
