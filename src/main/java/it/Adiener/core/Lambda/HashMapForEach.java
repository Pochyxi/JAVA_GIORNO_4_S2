package it.Adiener.core.Lambda;

import java.util.*;

public class HashMapForEach {

    public static void main( String[] args ) {

        List<String> words = new ArrayList<String>( Arrays.asList( "mela", "armadillo", "epicode" ) );
        words.removeIf( s -> s.charAt( 0 ) == 'a' );
        words.forEach( s -> System.out.println(s) );


        Map<String, String> m1 = new HashMap<>();
        m1.put( "mela", "mela" );
        m1.put( "armadillo", "armadillo" );
        m1.forEach( (k, v) -> System.out.println("key: " + k + " | value: " + v) );
    }
}
