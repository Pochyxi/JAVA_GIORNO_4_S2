package it.Adiener.core.JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main( String[] args ) {

        // generazione stream a partire da array nativo
        Stream<String> s1 = Arrays.stream(
                new String[] { "prima parola", "seconda parola", "terza parola" }
        );

        s1.forEach( System.out::println );

        // generazione stream tramite stream builder
        Stream<String> s2 = Stream.<String>builder()
                .add( "epicode" )
                .add( "java" )
                .add( "back-end" )
                .build();

        s2.forEach( ( el ) -> System.out.println( "l'elemento è: " + el ) );


        //generazione tramite generate
        Stream.generate( () -> "elemento" )
                .limit( 3 )
                .forEach( el -> System.out.println( el ) );

        Stream.iterate( 1, n -> n + 1 )
                .limit( 10 )
                .forEach( System.out::println );


        //generazione tramite lista
        List<String> words = new ArrayList<>( Arrays.asList( "epicode", "java", "back-end" ) );
        Stream<String> s3 = words.stream();
        Stream<String> s4 = words.stream();
        s3
                .filter( s -> s.charAt( 0 ) == 'j' )
                .forEach( s -> System.out.println( "el: " + s ) );

        List<Student> students = new ArrayList<>( Arrays.asList(
                new Student( "adiener", new int[]{10, 5, 6 ,9} ),
                new Student( "marco", new int[]{10, 5, 6 ,9} ),
                new Student( "manuel", new int[]{10, 5, 6 ,9} ),
                new Student( "rocco", new int[]{10, 5, 6 ,9} )

        ));
        System.out.println("studenti promossi: ");
        students.stream()
                .filter( st -> st.getAvg() >= 6 )
                .forEach( st -> System.out.println(st + " ") );

        s4
                .map( s -> s.toUpperCase())
                .filter( s -> s.charAt( 0 ) == 'J' )
                .forEach( st -> System.out.println(st + " ") );

    }
}


