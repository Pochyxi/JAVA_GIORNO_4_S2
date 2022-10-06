package it.Adiener.core.EsercizioStream;

//        Ex 4
//        creare un arraylist di 10 numeri, trasformali in stream e stampa solo i numeri superiori a 20

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main( String[] args ) {

        List<Integer> nums = new ArrayList<>( Arrays.asList( 10, 20, 30, 50, 19, 28, 7, 33, 77 ) );

        List<Integer> numMagg = nums.stream().filter( n -> n > 20 ).collect( Collectors.toList() );
        List<Integer> numMagg2 = nums.stream().filter( n -> n > 20 ).collect( Collectors.toCollection( ArrayList::new ) );

        nums.stream().filter( n -> n > 20 ).forEach( n -> System.out.println( n ) );

        System.out.println( numMagg );
        System.out.println( numMagg2 );

    }
}
